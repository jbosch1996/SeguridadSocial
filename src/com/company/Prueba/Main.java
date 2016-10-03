package com.company.Prueba;


/**
 * Created by usu26 on 19/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        SeguridadSocialHashMap seguridadHash = new SeguridadSocialHashMap();

        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tom�s", 35, 45000.00);
        Persona maria =  new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);


        seguridadHash.altaPersona(jose);
        seguridadHash.altaPersona(maria);
        seguridadHash.altaPersona(carlos);
        seguridadHash.altaPersona(anna);
        System.out.println("Altas a la seguridad social: " + seguridadHash.obtenerTodas());


        System.out.println("Baja a la seguridad social: " + anna);
        seguridadHash.bajaPersona(anna.getDni());


        System.out.println("Lista de afiliados a la S.S.: " + seguridadHash.obtenerTodas());


        System.out.println("obtenerPersonaPorNumSS: " + seguridadHash.obtenerPersonaPorNumSS(maria.getNum_seguridad()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadHash.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadHash.obtenerPersonasMayoresQue(25));



    }
}
