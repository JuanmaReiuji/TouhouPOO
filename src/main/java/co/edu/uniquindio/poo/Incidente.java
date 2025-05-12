package co.edu.uniquindio.poo;

import java.util.*;

public class Incidente {
    private String nombre;
    private List<Entidad> personajesInvolucrados;
    private List<Lugar> lugares;

    public Incidente(String nombre) {
        this.nombre = nombre;
        this.personajesInvolucrados = new ArrayList<>();
        this.lugares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Entidad> getPersonajesInvolucrados() {
        return personajesInvolucrados;
    }

    public void setPersonajesInvolucrados(List<Entidad> personajesInvolucrados) {
        this.personajesInvolucrados = personajesInvolucrados;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    @Override
    public String toString() {
        return nombre + ". Detalles:\n" + "Personajes: " + personajesInvolucrados + "\n" + "Lugares: " + lugares + "\n";
    }

    private Optional<Entidad> buscarPersonaje(Entidad entidad) {
        return personajesInvolucrados.stream().filter(e -> e.equals(entidad)).findFirst();
    }

    public String añadirPersonaje(Entidad entidad) {
        Optional<Entidad> personajeAux = buscarPersonaje(entidad);
        if (personajeAux.isPresent()) {
            return "El personaje ya participa en el incidente";
        } else {
            personajesInvolucrados.add(entidad);
            entidad.añadirIncidente(this);
            return "Personaje participando correctamente en el incidente";
        }
    }

    private Optional<Lugar> buscarLugar(Lugar lugar) {
        return lugares.stream().filter(l -> l.equals(lugar)).findFirst();
    }

    public String añadirLugar(Lugar lugar) {
        Optional<Lugar> lugarAux = buscarLugar(lugar);
        if (lugarAux.isPresent()) {
            return "El lugar ya es parte del incidente";
        } if (lugares.size() >= 7 ) {
            return "No pueden haber mas de 7 lugares en el incidente";
        } else {
            lugares.add(lugar);
            return "Lugar agregado correctamente como escenario en el incidente";
        }
    }
}