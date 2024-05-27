package com.dicoding.javadundamental.datetime;

import java.util.Calendar;

public class ExampleSpesificCalendar {
    public static void main(String[] args) {
        // menampilkan waktu sekrang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah : " + calendar.getTime());

        // menampilkanw waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu adalah tanggal : " + calendar.getTime());

        // menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan yang akan datang adalah bulan : " + calendar.getTime());

        // menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun yang akan datang adalah tahun : " + calendar.getTime());
    }
}
