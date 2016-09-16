package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Coche jaguar = new Coche("Jaguar","XF","2325JFS",4000,80000.0);
        Coche opel = new Coche("Opel","Astra","4214SDD",3000,10000.0);
        Coche seat = new Coche("Seat","Leon","2312LDD",2000,15000.0);

        List<Coche> cochesList = new ArrayList<>();

        cochesList.add(jaguar);
        cochesList.add(opel);
        cochesList.add(seat);

        System.out.println("Muestro el Jaguar : " + cochesList.get(0));

        System.out.println("Muestro el Mercedes : " + cochesList.get(1));

        System.out.println("Muestro el Seat : " + cochesList.get(2));


        Map<String, Coche> cocheMap = new HashMap<>();

        cocheMap.put("2325JFS",jaguar);
        cocheMap.put("4214SDD",opel);
        cocheMap.put("2312LDD",seat);

        System.out.println("Muestro el jaguar a partir de su matricula: " + cocheMap.get("2325JFS"));

        System.out.println("Muestro las keys del HashMap " + cocheMap.keySet());

        System.out.println("Muestro los values del HashMap " + cocheMap.values());




    }
}
