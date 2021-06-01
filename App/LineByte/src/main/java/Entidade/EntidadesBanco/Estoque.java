package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tabestoque")
public class Estoque implements Serializable,TemplateLista{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @ManyToOne
    private Produto produto;
    
    @Column(name = "qtd_estoque")
    private Integer qtdEstoque;

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

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,produto,qtdEstoque};
        
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Produto","QuantidadeEstoque"};
    }

    @Override
    public String toString() {
        return produto.getNome()+" - "+qtdEstoque;
    }
    
    
}
