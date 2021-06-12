package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabpessoa")
public class Pessoa implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "nome", length = 200)
    private String nome;
    
    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(name = "cpf", length = 20)
    private String cpf;

    @Column(name = "rg", length = 20)
    private String rg;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nasc")
    private Date dataNasc;

    @Column(name = "sexo")
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date data_nasc) {
        this.dataNasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,nome,endereco,cpf,rg,dataNasc,sexo};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Nome","Endereco","CPF","RG","DataNascimento","Sexo"};
    }
    
    @Override
    public String toString() {
        return id+" - "+nome;
    }
    /* //achei que precisava disso mas nao precisa nao, só estou deixando aqui caso futuramente aconteca algum B.O.
    @Override
    public boolean equals(Object obj) {
        Pessoa p = (Pessoa) obj;
        return (Objects.equals(this.getId(), p.getId()));
    }
    */
    
    
}
