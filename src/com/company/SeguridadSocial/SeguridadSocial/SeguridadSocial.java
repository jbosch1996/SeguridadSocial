package com.company.SeguridadSocial.SeguridadSocial;


import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/N�mero Seguridad Social
    public void altaPersona(Persona persona) {
        boolean repetida = false;
        for (Persona personaActual : personasList) {
            if (personaActual.getDni().equals(persona.getDni()) || personaActual.getNum_seguridad().equals(persona.getNum_seguridad())) {
                repetida = true;
                break;

            }
        }
        if (!repetida) {
            personasList.add(persona);
        }
    }
    public void bajaPersona(String dni) {

       // personasList.removeIf(persona -> persona.getDni().equals(dni));
        Persona aux = null;
        for(Persona personaActual : personasList){
            if(personaActual.getDni().equals(dni)){
                aux = personaActual;
                break;
            }


        }
        if(aux!=null){
            personasList.remove(aux);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni, String nombre) {
        for (Persona personaActual : personasList) {
            if (personaActual.getDni().equals(dni)) {
                return personaActual;
            }
        }
        return null;
    }


    public Persona obtenerPersonaPorNumSS(String numSS) {
        for (Persona personaActual : personasList) {
            if (personaActual.getNum_seguridad().equals(numSS)) {
                return personaActual;
            }
        }
        return null;
    }


    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getSalario()>=min && personaActual.getSalario()<=max){
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getEdad()> edad){
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas(){
        return personasList;

    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
