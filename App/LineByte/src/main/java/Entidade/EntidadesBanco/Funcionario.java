package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabfuncionario")
public class Funcionario implements Serializable,TemplateLista{
    
    @Id
    private Integer id;
    
    @OneToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Cargo cargo;
    
    @OneToOne
    private Login login;
    
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,pessoa,cargo,login,dataAdmissao,descricao};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Pessoa","Cargo","Login","DataAdmissao","Descricao"};
    }

    @Override
    public String toString() {
        return id+" - "+pessoa.getNome()+" - "+cargo;
    }
    
    
    
}
