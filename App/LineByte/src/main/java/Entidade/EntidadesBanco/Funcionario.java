package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabfuncionario")
public class Funcionario implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;
    
    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;
    
    @OneToOne
    @JoinColumn(name = "id_login")
    private Login login;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_admissao")
    private Date dataAdmissao;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_demissao")
    private Date dataDemissao;
    
    
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

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
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
        return new Object[]{id,pessoa,cargo,login,dataAdmissao,dataDemissao,descricao};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Pessoa","Cargo","Login","DataAdmissao","DataDemissao","Descricao"};
    }

    @Override
    public String toString() {
        return id+" - "+pessoa.getNome()+" - "+cargo;
    }
    
    
    
}
