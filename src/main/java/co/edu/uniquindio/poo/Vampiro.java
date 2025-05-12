package co.edu.uniquindio.poo;

public class Vampiro extends Entidad {
    private NecesidadSangre necesidadSangre;

    public Vampiro(String nombre, NecesidadSangre necesidadSangre) {
        super(nombre);
        this.necesidadSangre = necesidadSangre;
    }

    @Override
    public String mostrarInfo() {
        return "Vampiro: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados()
                + ". Que tanta sangre necesita beber?: " + necesidadSangre;
    }
}