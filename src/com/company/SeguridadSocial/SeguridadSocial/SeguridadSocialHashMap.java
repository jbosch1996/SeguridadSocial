package com.company.SeguridadSocial.SeguridadSocial;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashMap{

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
        //pers  onaMapDni.values();//Obtener todos los valores
        //personaMapDni.remove(dni);
        return personaMapDni.get(dni);
    }

    public void bajaPersona(String dni) {
        personaMapDni.remove(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapSs.get(numSS);
    }

    /*ublic List<Persona> obtenerPersonasRangoSalarial(double min, double max) {


        return personaMapDni.values().stream().filter(persona -> persona.getSalario()>min
                && persona.getSalario()< max).collect(Collectors.toList());
    }*/
    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> aux = new ArrayList<>();
        for (Persona persona : personaMapDni.values()){
            if (persona.getSalario()>=min && persona.getSalario()<=max){
                aux.add(persona);
            }
        }
        return aux;
    }
    
    public List<Persona> obtenerPersonasMayoresQue(int edad) {
    	 List<Persona> aux = new ArrayList<>();
         for (Persona persona : personaMapDni.values()) {
             if (persona.getEdad()> edad){
                 aux.add(persona);
             }
         }
         return aux;
    }
    public List<Persona> obtenerTodas(){
    	List<Persona> aux = new ArrayList<>();
    	for (Persona persona : personaMapDni.values()) {
                aux.add(persona);
        }
        return aux;
   }

    
    }