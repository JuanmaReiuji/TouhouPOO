package co.edu.uniquindio.poo;

public class Humano extends Entidad {

    public Humano(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrarInfo() {
        return "Humano: " + this.getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados();
    }
}