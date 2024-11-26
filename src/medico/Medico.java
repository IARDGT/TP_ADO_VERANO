package medico;

import utilities.HorarioDisponible;

public class Medico {
    private Integer idMedico;
    private String nombre;
    private Integer numeroDocumento;
    private String email;
    private String especialidad;
    private HorarioDisponible horarioDisponible;


    public Medico(Integer idMedico, String nombre, Integer numeroDocumento, String email, String especialidad, HorarioDisponible horarioDisponible) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.especialidad = especialidad;
        this.horarioDisponible = horarioDisponible;
    }
}
