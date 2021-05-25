package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabpessoa")
public class Pessoa implements Serializable,TemplateLista{
    
    @Id
    private Integer id;
    
    private String nome;
    
    @OneToOne
    private Endereco endereco;

    private String cpf;

    private String rg;

    @Temporal(TemporalType.DATE)
    private Date data_nasc;

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
    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,nome,endereco,cpf,rg,data_nasc,sexo};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Nome","Endereco","CPF","RG","DataNascimento","Sexo"};
    }
    
    @Override
    public String toString() {
        return id+" - "+nome;
    }
    
}
