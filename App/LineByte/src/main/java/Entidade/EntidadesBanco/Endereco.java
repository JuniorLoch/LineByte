package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tabendereco")
public class Endereco implements Serializable,TemplateLista{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "cidade", length = 50)
    private String cidade;
    
    @Column(name = "estado", length = 50)
    private String estado;
    
    @Column(name = "bairro", length = 50)
    private String bairro;
    
    @Column(name = "rua", length = 50)
    private String rua;
    
    @Column(name = "numero", length = 10)
    private String numero;
    
    @Column(name = "cep", length = 12)
    private String cep;
    
    @Column(name = "complemento", length = 1000)
    private String complemento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return rua + ", "+numero;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,cidade,estado,bairro,rua,numero,cep,complemento};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Cidade","Estado","Bairro","Rua","Numero","CEP","Complemento"};
    }

}
