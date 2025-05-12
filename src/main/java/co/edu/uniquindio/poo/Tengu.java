package co.edu.uniquindio.poo;

public class Tengu extends Entidad {
    private TipoTengu tipoTengu;

    public Tengu(String nombre, TipoTengu tipoTengu) {
        super(nombre);
        this.tipoTengu = tipoTengu;
    }

    @Override
    public String mostrarInfo() {
        return "Tengu: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Tipo de tengu: " + tipoTengu;
    }
}