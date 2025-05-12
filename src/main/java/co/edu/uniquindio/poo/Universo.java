package co.edu.uniquindio.poo;

import java.util.*;

public class Universo {
    private String nombre = "Gensokyo";
    private List<Lugar> lugares;
    private List<Entidad> personajes;
    private List<Incidente> incidentes;

    public Universo() {
        this.lugares = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.incidentes = new ArrayList<>();
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public List<Entidad> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Entidad> personajes) {
        this.personajes = personajes;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    @Override
    public String toString() {
        return nombre + ". Lugares: " + lugares + ". Personajes: " + personajes
                + ". Incidentes ocurridos: " + incidentes;
    }

    private Optional<Lugar> buscarLugar(String nombre) {
        return lugares.stream().filter(l -> l.getNombre().equals(nombre)).findFirst();
    }

    public String agregarLugar(Lugar lugar) {
        Optional<Lugar> optionalLugar = buscarLugar(lugar.getNombre());
        if (optionalLugar.isPresent()) {
            return "El lugar ya existe en Gensokyo.";
        } else {
            lugares.add(lugar);
            return "Lugar agregado a Gensokyo.";
        }
    }

    private Optional<Entidad> buscarEntidad(String nombre) {
        return personajes.stream().filter(p -> p.getNombre().equals(nombre)).findFirst();
    }

    public String agregarPersonaje(Entidad entidad) {
        Optional<Entidad> optionalEntidad = buscarEntidad(entidad.getNombre());
        if (optionalEntidad.isPresent()) {
            return "El personaje ya existe en Gensokyo.";
        } else {
            personajes.add(entidad);
            return "Personaje agregado a Gensokyo. Yukari estuvo aquí ;).";
        }
    }

    private Optional<Incidente> buscarIncidente(String nombre) {
        return incidentes.stream().filter(p -> p.getNombre().equals(nombre)).findFirst();
    }

    public String agregarIncidente(Incidente incidente) {
        Optional<Incidente> optionalIncidente = buscarIncidente(incidente.getNombre());
        if (optionalIncidente.isPresent()) {
            return "El incidente ya ocurrio en Gensokyo.";
        } else {
            incidentes.add(incidente);
            return "Un nuevo incidente ha ocurrido en Gensokyo.";
        }
    }
}