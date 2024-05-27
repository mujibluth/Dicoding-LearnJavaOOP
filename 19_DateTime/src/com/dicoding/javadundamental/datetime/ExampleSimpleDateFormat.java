package com.dicoding.javadundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String dateFormated = sdf.format(new Date());

        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan Format : " + dateFormated);
    }
}
