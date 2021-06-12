package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabdespesa")
public class Despesa implements Serializable,TemplateLista{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_despesa")
    private TipoDespesa tipoDespesa;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento")
    private Date dataVencimento;
    
    @Column(name = "pago")
    private Boolean pago;
    
    @Column(name = "nome", length = 200)
    private String nome;
    
    @Column(name = "valor")
    private Float valor;
    
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,nome,tipoDespesa,valor,pago,dataVencimento};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Nome","TipoDespesa","Valor","Pago","DataVencimento"};
    }
}
