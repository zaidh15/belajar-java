package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {

        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("earth");

        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
//            looping menggunakan iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
