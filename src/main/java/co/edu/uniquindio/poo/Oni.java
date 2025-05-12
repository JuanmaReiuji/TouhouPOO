package co.edu.uniquindio.poo;

public class Oni extends Entidad {
    private int amorPorLaBebida;

    public Oni(String nombre, int amorPorLaBebida) {
        super(nombre);
        this.amorPorLaBebida = amorPorLaBebida;
    }

    @Override
    public String mostrarInfo() {
        return "Oni: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Que tanto ama la bebida?: " + amorPorLaBebida + "%";
    }
}