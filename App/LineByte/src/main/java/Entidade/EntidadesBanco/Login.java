package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tablogin")
public class Login implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String usuario;
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,usuario,senha};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Usuario","Senha"};
    }

    @Override
    public String toString() {
        return id+" - "+usuario;
    }
    
    
}
