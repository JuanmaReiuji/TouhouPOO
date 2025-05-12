package co.edu.uniquindio.poo;

public class Dios extends Entidad {
    private String diosDe;

    public Dios(String nombre, String diosDe) {
        super(nombre);
        this.diosDe = diosDe;
    }

    @Override
    public String mostrarInfo() {
        return "Dios: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Dios de: " + diosDe;
    }
}