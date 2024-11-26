package paciente;

import java.util.ArrayList;

public class FacadePaciente {
    private static FacadePaciente instancia;
    private ArrayList<Paciente> listaPaciente;

    private FacadePaciente() {
        this.listaPaciente = new ArrayList<Paciente>();
    }



    public static FacadePaciente getInstance(){
        if (instancia == null){
            instancia = new FacadePaciente();
        }
        return instancia;
    }

    public void crearPaciente(String nombre, Integer numeroDocumento, String email){
        Integer idPaciente = this.listaPaciente.size();
        Paciente paciente = new Paciente(idPaciente, nombre, numeroDocumento, email);
        listaPaciente.add(paciente);
    }
}
