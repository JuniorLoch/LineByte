package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabcompra")
public class Compra implements Serializable,TemplateLista{

    public Compra() {
        itemCompras = new LinkedList<>();
    }
    
    @OneToMany(mappedBy = "compra",fetch = FetchType.LAZY)
    private List<ItemCompra> itemCompras;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_compra")
    private Date dataCompra;
    
    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;
    
    @Column(name = "valor_total")
    private Double valorTotal;
    
    @Column(name = "nota_fiscal")
    private String notaFiscal;

    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }

    public void setItemCompras(List<ItemCompra> itemCompras) {
        this.itemCompras = itemCompras;
    }
    
    public void setItemCompras(ItemCompra itemCompras) {
        this.itemCompras.add(itemCompras);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,dataCompra,fornecedor,valorTotal,notaFiscal};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Data","Fornecedor","ValorTotal","NFe"};
    }

    @Override
    public String toString() {
        return id+" - "+fornecedor.getNomeFornecedor()+" - "+dataCompra+" - "+valorTotal;
    }
    
    

}
