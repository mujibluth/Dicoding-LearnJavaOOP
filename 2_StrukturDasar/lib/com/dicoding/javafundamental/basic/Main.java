package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Becak;
import com.dicoding.javafundamental.basic.kendaraan.Pesawat;
import com.dicoding.javafundamental.basic.kendaraan.Sepeda;
import com.dicoding.javafundamental.basic.kendaraan.Tank;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.kendaraan.Kereta;

import com.dicoding.javafundamental.basic.music.Gitar;
import com.dicoding.javafundamental.basic.music.Drum;
import com.dicoding.javafundamental.basic.music.Gendang;
import com.dicoding.javafundamental.basic.music.Tang;

import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();
        Drum.bunyi();
        Gendang.bunyi();
        Tang.bunyi();

        
        Becak.jumlahBan();
        Pesawat.jumlahBan();
        Sepeda.jumlahBan();
        Tank.jumlahBan();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}