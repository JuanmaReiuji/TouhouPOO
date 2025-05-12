package co.edu.uniquindio.poo;

public class Celestial extends Entidad {
    private boolean presenciaTerrnal;

    public Celestial(String nombre, boolean presenciaTerrnal) {
        super(nombre);
        this.presenciaTerrnal = presenciaTerrnal;
    }

    @Override
    public String mostrarInfo() {
        return "Celestial: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados()
                + ". Esta en la tierra de Gensokyo?: " + presenciaTerrnal;
    }
}