package co.edu.uniquindio.poo;

public class Shinigami extends Entidad {
    private final Yama yamaAsociado;

    public Shinigami(String nombre, Yama yamaAsociado) {
        super(nombre);
        this.yamaAsociado = yamaAsociado;
    }

    @Override
    public String mostrarInfo() {
        return "Shinigami: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados()
                + ". Yama para el que trabaja: " + yamaAsociado;
    }
}