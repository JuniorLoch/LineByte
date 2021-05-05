package Entidade.EntidadesBanco;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class TipoDespesa implements Serializable{
    
    @Id
    private Integer id;
    
    private String nome;

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
    
    
}
