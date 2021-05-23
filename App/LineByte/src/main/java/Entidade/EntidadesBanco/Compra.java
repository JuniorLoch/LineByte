package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabcompra")
public class Compra implements Serializable,TemplateLista{
    
    @OneToMany(mappedBy = "itemCompra",fetch = FetchType.LAZY)
    private List<ItemCompra> itemCompras;
    
    @Id
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    
    @ManyToOne
    private Fornecedor fornecedor;
    
    private Double valorTotal;
    private String notaFiscal;

    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }

    public void setItemCompras(List<ItemCompra> itemCompras) {
        this.itemCompras = itemCompras;
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

}
