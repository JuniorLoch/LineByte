package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "tabitemvenda")
public class ItemVenda implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne
    private Venda venda;
    
    private Float valor;
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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        return new Object[]{id,produto,venda,valor,quantidade};

    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Produto","Venda","Valor","Quantidade"};
    }

    @Override
    public String toString() {
        return produto.getNome()+" - "+quantidade;
    }
        
    
}
