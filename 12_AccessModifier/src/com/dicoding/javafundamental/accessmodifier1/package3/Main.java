package com.dicoding.javafundamental.accessmodifier1.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilai nya adalah " + Perhitungan.nilai);

        for (int x = 0; x < 5; x++) {
            new Perhitungan();
        }

        System.out.println("Sampai " + Perhitungan.nilai);
        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
