package Entidade.EntidadesBanco;

import Interfaces.TemplateLista;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
//import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tabpontos")
public class Pontos implements Serializable,TemplateLista{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "hora_entrada")
    private Date horaEntrada;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "hora_saida")
    private Date horaSaida;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_ponto")
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
    
    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Date getDataPonto() {
        return dataPonto;
    }

    public void setDataPonto(Date dataPonto) {
        this.dataPonto = dataPonto;
    }

    @Override
    public Object[] getDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfhora = new SimpleDateFormat("hh:mm");
        return new Object[]{id,funcionario,sdfhora.format(horaEntrada),sdfhora.format(horaSaida),sdf.format(dataPonto)};
    }

    @Override
    public String[] getTitulos() {
        return new String[]{"ID","Funcionario","HoraEntrada","HoraSaida","DataPonto"};
    }
    
    
}
