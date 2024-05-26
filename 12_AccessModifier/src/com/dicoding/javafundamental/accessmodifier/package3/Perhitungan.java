package com.dicoding.javafundamental.accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    protected static int getNilai() {
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }

    // final int nilai = 5;

    // void ubahNilai() {
    //     // Kode di bawah akan menampilkan error
    //     nilai = 10;
    // }
}
