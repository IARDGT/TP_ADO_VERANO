package medico;

import paciente.Paciente;
import utilities.HorarioDisponible;

import java.util.ArrayList;

public class FacadeMedico {
    private static FacadeMedico instancia;
    private ArrayList<Medico> listaMedico;

    private FacadeMedico() {
        this.listaMedico = new ArrayList<Medico>();
    }



    public static FacadeMedico getInstance(){
        if (instancia == null){
            instancia = new FacadeMedico();
        }
        return instancia;
    }

    public void crearMedico(String nombre, Integer numeroDocumento, String email, String especialidad, HorarioDisponible horarioDisponible){
        Integer idMedico = this.listaMedico.size();
        Medico medico = new Medico(idMedico, nombre, numeroDocumento, email, especialidad, horarioDisponible);
        listaMedico.add(medico);
    }
}
