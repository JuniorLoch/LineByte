package Entidade.EntidadesBanco;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabpontos")
public class Pontos implements Serializable{
    
    @Id
    private Integer id;
    
    @ManyToOne
    private Funcionario funcionario;
    
    @Temporal(TemporalType.TIME)
    private Time horaEntrada;
    
    @Temporal(TemporalType.TIME)
    private Time horaSaida;
    
    @Temporal(TemporalType.DATE)
    private Date dataPonto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Time horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Date getDataPonto() {
        return dataPonto;
    }

    public void setDataPonto(Date dataPonto) {
        this.dataPonto = dataPonto;
    }
    
    
}
