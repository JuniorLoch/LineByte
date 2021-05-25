package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "tabcliente")
public class Cliente implements Serializable,TemplateLista{
    @Id
    private Integer id;
    
    @OneToOne
    private Pessoa pessoa;
    private String senha;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{pessoa,senha};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"Pessoa","Senha"};
    }

    @Override
    public String toString() {
        return pessoa.getNome();
    }
    
    
}
