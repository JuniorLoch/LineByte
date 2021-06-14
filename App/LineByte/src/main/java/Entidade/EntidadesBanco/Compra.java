package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import Interfaces.TemplateValor;
import java.io.Serializable;
import java.text.SimpleDateFormat;
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
public class Compra implements Serializable,TemplateLista,TemplateValor{

    public Compra() {
        itemCompras = new LinkedList<>();
    }
    
    @OneToMany(mappedBy = "compra",fetch = FetchType.LAZY)
    private List<ItemCompra> itemCompras;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "datad")
    private Date dataCompra;
    
    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;
    
    @Column(name = "valor")
    private Double valorTotal;
    
    @Column(name = "nota_fiscal", length = 70)
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new Object[]{id,sdf.format(dataCompra),fornecedor,valorTotal,notaFiscal};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Data","Fornecedor","ValorTotal","NFe"};
    }

    @Override
    public String toString() {
        return id+" - "+fornecedor.getNomeFornecedor()+" - "+dataCompra+" - "+valorTotal;
    }

    @Override
    public Float getValorv() {
        return Float.parseFloat(valorTotal+"");
    }
    
    

}
