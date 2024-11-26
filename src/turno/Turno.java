package turno;

import medico.Medico;
import paciente.Paciente;

import java.util.Date;

public abstract class Turno {
    private Integer idTurno;
    private String especialidad;
    private Date horario;
    private Paciente paciente;
    private Medico medico;
    private EstadoTurno estadoTurno;

    public Turno(Integer idTurno, Paciente paciente, String especialidad, Date horario) {
        this.especialidad = especialidad;
        this.horario = horario;
        this.paciente = paciente;
        this.estadoTurno = new EstadoPendiente(this);
        asignarMedico();
    }

    public void asignarMedico(){
        //this.setEstadoTurno();
        //this.setEstadoTurno();
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setEstadoTurno(EstadoTurno estadoTurno) {
        this.estadoTurno = estadoTurno;
    }
}
