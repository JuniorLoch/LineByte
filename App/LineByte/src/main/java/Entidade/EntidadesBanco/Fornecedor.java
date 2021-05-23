package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "tabFornecedor")
public class Fornecedor implements Serializable,TemplateLista{
    @Id
    private Integer id;
    
    private String nomeFornecedor;
    private String cpnj;
    @OneToOne
    private Endereco endereco;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{id,nomeFornecedor,cpnj,endereco};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","NomeForncedor","CNPJ","Endereco"};
    }

    
    
}
