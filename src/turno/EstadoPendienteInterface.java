package turno;

public class EstadoPendienteInterface implements IEstadoTurno{

    private Turno turno;
    @Override
    public void EstadoTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public void haceAlgo() {

    }
}
