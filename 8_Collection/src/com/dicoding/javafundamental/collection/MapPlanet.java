package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        Map<String, Planet> planets = new HashMap(); // <.., Planet> dimbil dari class lain
        planets.put("key-1", new Planet("Mercury", 0.06)); // methode .put() digunakan untuk menambahkan objek ke Map
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11)); // menambahkan key yang sama pada Map

        System.out.println("Map planets awal: (size ="+ planets.size() +")" ); // methode .size() digunakan untuk mengambil ukuran Set
        for (String key : planets.keySet()) { // looping key dari Map
            System.out.println("\t" + key + " : " + planets.get(key)); // methode .get(key) untuk melihat isi Map berdasarkan key
        }

        planets.remove("key-2");

        System.out.println("Map planets akhir: (size =" + planets.size() +") ");
        for (Planet planet : planets.values()) { // looping value dari Map
            System.out.println("\t" + planet);
        }
    }
}
