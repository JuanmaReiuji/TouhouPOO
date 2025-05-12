package co.edu.uniquindio.poo;

import java.util.*;

abstract class Entidad {
    private String nombre;
    private List<Habilidad> habilidades;
    private List<Incidente> incidentesParticipados;

    public Entidad(String nombre) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
        this.incidentesParticipados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Incidente> getIncidentesParticipados() {
        return incidentesParticipados;
    }

    public void setIncidentesParticipados(List<Incidente> incidentesParticipados) {
        this.incidentesParticipados = incidentesParticipados;
    }

    @Override
    public String toString(){
        return nombre;
    }

    public abstract String mostrarInfo();

    public void entrenarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    private Optional<Incidente> buscarIncidente(String nombre) {
        return incidentesParticipados.stream().filter(i -> i.getNombre().equals(nombre)).findFirst();
    }

    public String añadirIncidente(Incidente incidente) {
        Optional<Incidente> optionalIncidente = buscarIncidente(incidente.getNombre());
        if (optionalIncidente.isPresent()) {
            return "El personaje ya participó en el incidente";
        } else {
            incidentesParticipados.add(incidente);
            incidente.añadirPersonaje(this);
            return "Incidente guardado al historial del personaje";
        }
    }
}
