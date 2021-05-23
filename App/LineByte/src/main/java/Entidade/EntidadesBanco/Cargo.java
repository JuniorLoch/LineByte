package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "tabcargo")
public class Cargo implements Serializable,TemplateLista{
    
    @Id
    private Integer id;
    
    private String nomeCargo;
    
    private Float salario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public Object[] getDados() {
        return new Object[]{nomeCargo,salario};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"Cargo","Salario"};
    }

    
}
