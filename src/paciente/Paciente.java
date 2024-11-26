package paciente;

import turno.Turno;

import java.util.Date;

public class Paciente {

    private Integer idPaciente;
    private String nombre;
    private Integer numeroDocumento;
    private String email;
    private HistorialClinico historiaClinica;
    private EstadoTratamiento estadoTratamiento;

    public Paciente(Integer idPaciente, String nombre, Integer numeroDocumento, String email) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.historiaClinica = new HistorialClinico();
        this.estadoTratamiento = null;
    }
}
