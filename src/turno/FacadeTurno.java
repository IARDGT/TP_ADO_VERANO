package turno;

import paciente.FacadePaciente;
import paciente.Paciente;

import java.util.ArrayList;
import java.util.Date;

public class FacadeTurno {

    private static FacadeTurno instancia;
    private ArrayList<Turno> listaTurno;

    private FacadeTurno() {
        this.listaTurno = new ArrayList<Turno>();
    }

    public static FacadeTurno getInstance(){
        if (instancia == null){
            instancia = new FacadeTurno();
        }
        return instancia;
    }

    public void crearTurno(Paciente paciente, String especialidad, Date horario){
        Integer idTurno = this.listaTurno.size();
        Turno turno = new TurnoRegular(idTurno, paciente, especialidad, horario);
        listaTurno.add(turno);
    }
}
