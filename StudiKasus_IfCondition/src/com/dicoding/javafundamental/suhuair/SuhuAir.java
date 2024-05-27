package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        // contoh pemakkaian IF tiga kasus : wujud air
        int T;

        System.out.println("Contoh IF tigas kasus");
        System.out.print("Suhu (der. C) = ");

        // scanner untuk memasukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //masukan suhu air dengan tipe data Int 

        // proses pengecekan dengan IF
        if (T < 0) {
            System.out.println("Jika Suhu (der. C) = " + T + ", Maka Air = 'Beku'");
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Jika Suhu (der. C) = " + T + ", Maka Air = 'Cair'");
        } else if (T > 100) {
            System.out.println("Jika Suhu (der. C) = " + T + ", Maka Air = 'Uap/Gas'");
        }
    }
}
