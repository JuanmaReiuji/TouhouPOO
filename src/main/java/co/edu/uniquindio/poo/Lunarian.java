package co.edu.uniquindio.poo;

public class Lunarian extends Entidad {
    private String origen;

    public Lunarian(String nombre, String origen) {
        super(nombre);
        this.origen = origen;
    }

    @Override
    public String mostrarInfo() {
        return "Lunarian: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Lugar de origen: " + origen;
    }
}
