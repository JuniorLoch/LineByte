package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tabtipodespesa")
public class TipoDespesa implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "nome", length = 200)
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

    @Override
    public Object[] getDados() {
        return new Object[]{id,nome};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Nome"};
    }

    @Override
    public String toString() {
        return id+" - "+nome;
    }
    
    
}
