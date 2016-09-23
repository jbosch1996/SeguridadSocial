package com.company.SeguridadSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashMap {

    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSs = new HashMap<>();

    public void altaPersona(Persona persona) {

        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapSs.containsKey(persona.getNum_seguridad())) {
            personaMapDni.put(persona.getDni(), persona);
            personaMapSs.put(persona.getNum_seguridad(), persona);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni, String nombre) {
        //Para obtener las keys
        //personaMapDni.keySet();//Obtener todas las Keys
        //personaMapDni.values();//Obtener todos los valores
        //personaMapDni.remove(dni);
        return personaMapDni.get(dni);
    }

    public void bajaPersona(String dni) {
        personaMapDni.remove(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapSs.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(Persona persona, double min, double max) {
        List<Persona> aux = new ArrayList<>();
        if (persona.getSalario() >= min && persona.getSalario() <= max) {
            aux.add(persona);

        }
        return aux;
    }
}



