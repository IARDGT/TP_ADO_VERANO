package turno;

import paciente.Paciente;

import java.util.Date;

public class TurnoRegular extends Turno{

    public TurnoRegular(Integer idTurno, Paciente paciente, String especialidad, Date horario) {
        super(idTurno, paciente, especialidad, horario);
    }
}
