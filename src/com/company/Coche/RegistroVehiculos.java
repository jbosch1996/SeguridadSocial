package com.company.Coche;

import java.util.*;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    public Coche obtenerVehiculo(String matricula) {
        for (Coche cocheList : coches) {
            if (cocheList.getMatricula().equals(matricula)) {
                return cocheList;
            }
        }

        return null;
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
            coches.remove(aux);
        }
    }


    public Coche obtenerVehiculoPrecioMax() {

        Coche max_coche = null;
        double max = 0;
        for (Coche coche : coches) {
            if (coche.getPrecio() >= max) {
                max_coche = coche;
            }
            else if(max_coche == null){
                return max_coche;
            }
        }
        return max_coche;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> ListCoches = new ArrayList<>();
        for (Coche coche : coches) {
            if (coche.getMarca().equals(marca)) {
                ListCoches.add(coche);
            }
        }

        return null;
    }


    public List<Coche> obtenerTodos() {
        List<Coche> ListCoches = new ArrayList<>();
        for (Coche coche : coches) {
            ListCoches.add(coche);
        }
        return ListCoches;
    }


}
