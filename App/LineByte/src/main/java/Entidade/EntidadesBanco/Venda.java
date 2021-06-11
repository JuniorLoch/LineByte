package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name = "tabvenda")
public class Venda implements Serializable,TemplateLista {

    public Venda() {
        itemVendas = new LinkedList<>();
    }

    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itemVendas;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    //ajustar para @ManyToOne
    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;
    
    @Column(name = "valor_venda")
    private Float valorVenda;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_venda")
    private Date dataVenda;
    
    //ajustar para @ManyToOne
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @Column(name = "nota_fiscal")
    private String notaFiscal;

    public List<ItemVenda> getItemVendas() {
        return itemVendas;
    }

    public void setItemVendas(List<ItemVenda> itemVendas) {
        this.itemVendas = itemVendas;
    }

    public void setItemVendas(ItemVenda itemVendas) { // sobrecarga para aceitar a adicao de um item na lista
        this.itemVendas.add(itemVendas);
    }
    
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

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
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
