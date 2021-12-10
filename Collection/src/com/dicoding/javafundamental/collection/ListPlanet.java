package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class ListPlanet {

    public static void main(String[] args) {
//        Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

//        menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println("List Planet awal: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index- " + i + "=" + planets.get(i));
        }

        planets.remove("Venus");

        System.out.println("List Planet akhir: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index- " + i + "=" + planets.get(i));
        }
    }
}
