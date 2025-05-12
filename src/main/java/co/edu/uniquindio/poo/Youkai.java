package co.edu.uniquindio.poo;

public class Youkai extends Entidad {
    private String tipo;

    public Youkai(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return "Youkai: " + this.getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados()
                + ". Youkai de: " + tipo;
    }
}