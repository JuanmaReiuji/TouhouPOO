package co.edu.uniquindio.poo;

import java.util.*;

public class Kappa extends Entidad {
    private Inteligencia nivelIQ;
    private List<String> inventos;

    public Kappa(String nombre, Inteligencia nivelIQ) {
        super(nombre);
        this.nivelIQ = nivelIQ;
        this.inventos = new ArrayList<>();
    }

    @Override
    public String mostrarInfo() {
        return "Kappa: " + getNombre() + ". habilidades: " + getHabilidades() +
                ". Incidentes donde ha participado: " + getIncidentesParticipados() +
                ". Coeficiente intelectual: " + nivelIQ + ". Inventos realizados: "
                + inventos;
    }
}