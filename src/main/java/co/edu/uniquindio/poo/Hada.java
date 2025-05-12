package co.edu.uniquindio.poo;

public class Hada extends Entidad {
    private String hadaDe;

    public Hada(String nombre, String hadaDe) {
        super(nombre);
        this.hadaDe = hadaDe;
    }

    @Override
    public String mostrarInfo() {
        return "Hada: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados()
                + "Hada de: " + hadaDe;
    }

}
