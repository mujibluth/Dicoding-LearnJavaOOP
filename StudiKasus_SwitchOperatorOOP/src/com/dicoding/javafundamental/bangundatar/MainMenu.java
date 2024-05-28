package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class MainMenu {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // kamus
        Lingkaran olingkaran;
        PersegiPanjang opersegipanjang;
        SegitigasSiku osegitigassiku;
        int s1, s2, r;

        olingkaran = new Lingkaran();
        opersegipanjang = new PersegiPanjang();
        osegitigassiku = new SegitigasSiku();

        // program
        // panggilan method
        mainMenu();

        // kondisi untuk pilihan menu yang dimasukan
        switch(pilihan) {
            case '1':{
                System.out.print("Msukan panjang persegi yang diinginkan: ");
                s1 = scanner.nextInt();
                System.out.print("Msukan lebatr persegi yang diinginkan: ");
                s2 = scanner.nextInt();
                System.out.println("------------------");
                System.out.println("Luas persegi adalah: " + opersegipanjang.luas(s1, s2));
                System.out.println("Keliling persegi adalah: " + opersegipanjang.keliling(s1, s2));
                break;
            }

            case '2': {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitigas siku: ");
                s2 = scanner.nextInt();
                System.out.println("------------------");
                System.out.println("Luas segitigas adalah: " + osegitigassiku.luas(s1, s2));
                System.out.println("Keliling segitiga adalah: " + osegitigassiku.keliling(s1, s2));
                break;
            }

            case '3': {
                System.out.print("Masukan jaring-jaring lingkaran: ");
                r = scanner.nextInt();
                System.out.println("------------------");
                System.out.println("Luas lingkaran adalah: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran adalah: " + olingkaran.keliling(r));
                break;
            }
        
            default: {
                System.out.println("Tidak ada pilihan yang dimasukan/ pilihan yang dimasukan tidak valid!");
                break;
            }
        }
    }

    private static void mainMenu() {
        // pilihan menu
        System.out.println("======================================");
        System.out.println("Mau menghitung luas dan keliling apa? pilihanya adalah");
        System.out.println("1. Persegi pajang");
        System.out.println("2. Segitigas siku");
        System.out.println("3. Lingkaran");

        System.out.print("Masukan angka menu: ");
        pilihan = scanner.next().charAt(0);
    }
}
