package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class Navigation {
    public static void main(String[] args) {
        String dirname = "/Users/abdulmujiburrohmanluthfi/Downloads/Navigate.rtf";
        File file = null;
        String[] paths;

        try {
            // instansiasi objek file
            file = new File(dirname);

            // ambil list files dan masukan ke String paths
            paths = file.list();

            // tampikan semwa path yang ada
            for (String path : paths) {
                System.out.println(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
