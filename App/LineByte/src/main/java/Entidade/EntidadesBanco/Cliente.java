package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tabcliente")
public class Cliente implements Serializable,TemplateLista{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{pessoa};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"Pessoa"};
    }

    @Override
    public String toString() {
        return pessoa.getNome();
    }
    
    
}
