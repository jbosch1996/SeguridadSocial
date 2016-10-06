package com.company.Coche;

import java.util.*;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {


    }


    public void eliminarVehiculo(String matricula) {
        Coche aux = null;
        for (Coche cocheActual : coches) {
            if (cocheActual.getMatricula().equals(matricula)) {
                aux = cocheActual;
                break;
            }
        }
        if (aux != null) {
            cocheActual.remove(aux);
        }
    }


    public Optional<Coche> obtenerVehiculoPrecioMax() {

        Coche max = null;


        for (Coche coche : coches) {
            if (max == null) {
                max = coche;
            }
            else if(coche.getPrecio() > max){
                max = coche;
            }
        }
        return coche;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
    }

    public List<Coche> obtenerTodos() {
    }
}