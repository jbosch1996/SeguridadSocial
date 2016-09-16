package com.company;

import java.util.ArrayList;
import java.util.List;

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
    }
}
