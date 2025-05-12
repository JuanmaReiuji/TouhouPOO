package co.edu.uniquindio.poo;

public class Fantasma extends Entidad {
    private String muerte;

    public Fantasma(String nombre, String muerte) {
        super(nombre);
        this.muerte = muerte;
    }

    @Override
    public String mostrarInfo() {
        return "Fantasma: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Causa de muerte: " + muerte;
    }
}