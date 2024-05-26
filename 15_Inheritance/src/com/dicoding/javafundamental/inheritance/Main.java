package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
        
        System.out.println("----------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Kucing));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("-----------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("------------------------------");

        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "Subtropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow uquals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("-------------------------------");

        Object o = new Kucing(); // kucing adalah object
        Hewan h = new Kucing(); // kucing adalah hewan
        Kucing k = new Kucing(); // kucing adalah kucing

        // o.makan(); --> error, karena methode makan() tidak ada di class object nya
        h.makan();
        k.makan();

        Object object = k; // bisa langsung di assign
        Hewan hewanK = k; // bisa langsung di assign

        // object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        // Hewan harimau =  new Hewan();
        // Kucing anggora (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}
