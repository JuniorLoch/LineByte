package Entidade.EntidadesBanco;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tabproduto")
class Produto implements Serializable{

    @OneToMany(mappedBy = "produto",fetch = FetchType.LAZY)
    private List<ItemCompra> itemCompras;
    
    @OneToMany(mappedBy = "produto",fetch = FetchType.LAZY)
    private List<ItemVenda> itemVendas;

    @OneToMany(mappedBy = "produto",fetch = FetchType.LAZY)
    private List<Estoque> estoques;

    @Id
    private Integer id;
    
    private String nome;
    private String tamanho;
    private String marca;
    private Float valor;
    private String cor;
    private String sexo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
