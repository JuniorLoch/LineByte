package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tabitemcompra")
public class ItemCompra implements Serializable,TemplateLista{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(name = "id_compra")
    private Compra compra;
    
    @Column(name = "valor")
    private Float valor;
    
    @Column(name = "quantidade")
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,produto,compra,valor,quantidade};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Produto","Compra","valor","Quantidade"};
    }
    
    @Override
    public String toString() {
        return produto.getNome()+" - "+quantidade;
    }
}
