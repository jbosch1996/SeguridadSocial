package com.company.Coche;

import java.util.ArrayList;
import java.util.List;

public class MainVehiculos {
    public static void main(String[] args) {
        Coche Jaguar = new Coche("1234ENG", "Jaguar", "TheRoadIsYours", 200000);
        Coche BMW = new Coche("9065AME", "BMW", "LoveAtFirstDrive", 60000);
        Coche Lexus = new Coche("5638DDD", "Lexus", "FastAndGlorious", 120000);
        Coche Austin = new Coche("3564GER", "Austin", "BeLikeBond", 150000);
        Coche RomeoAlfaJulietta = new Coche("4749JAV", "RomeoAlfaJulietta", "DramaMasterpiece", 12000);

        RegistroVehiculos registro = new RegistroVehiculos();
        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Austin);
        registro.registrarVehiculo(RomeoAlfaJulietta);
        // Debes comprobar que el HashSet no permite duplicados
        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println(registro.obtenerTodos());

        Coche coche = registro.obtenerVehiculo("4749JAV");
        if (coche != null) {
            System.out.println("Coche con la matricula 4849JAV " + coche);
        }

        List<Coche> coche_list = new ArrayList<>(registro.obtenerVehiculosMarca("Lexus"));

        for (Coche coche_list_2 : coche_list) {
            System.out.println(coche_list_2);
        }
        Coche coche_maximo = registro.obtenerVehiculoPrecioMax();

        if (coche_maximo != null) {
            System.out.println(coche_maximo);
        }
        System.out.println("Eliminando coche con matricula 1234ENG");
        registro
                .eliminarVehiculo("1234ENG");

        System.out.println(registro.obtenerTodos());

    }
}