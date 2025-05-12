package co.edu.uniquindio.poo;

public class Yama extends Entidad {

    public Yama(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrarInfo() {
        return "Yama: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados();
    }
}
