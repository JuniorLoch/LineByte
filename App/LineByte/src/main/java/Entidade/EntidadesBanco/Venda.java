package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name = "tabvenda")
public class Venda implements Serializable,TemplateLista {
    
    @Id
    private Integer id;
    
    //ajustar para @ManyToOne
    @ManyToOne
    private Funcionario funcionario;
    
    private Float valorVenda;
    
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    
    //ajustar para @ManyToOne
    @ManyToOne
    private Cliente cliente;
    
    private Integer notaFiscal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Integer notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,funcionario,dataVenda,cliente,notaFiscal};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Funcionario","DataVenda","Cliente","NotaFiscal"};
    }

    @Override
    public String toString() {
        return id+" - "+funcionario.getPessoa().getNome()+" - "+dataVenda+" - "+valorVenda;
    }
    
    
}
