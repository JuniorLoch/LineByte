package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "tabgerente")
public class Gerente implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Login login;
    
    @OneToOne
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,login,pessoa};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Login","Pessoa"};
    }
    
    
}
