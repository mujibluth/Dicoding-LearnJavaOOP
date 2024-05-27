package com.dicoding.javadundamental.datetime;

import java.util.Calendar;

public class EaxampleSplitCalendar {
    public static void main(String[] args) {
        // menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // menampilkan waktu yang spesifik/ yang sudah dibagi
        System.out.println("Tanggal  : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan    : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun    : " + calendar.get(Calendar.YEAR));
    }
}
