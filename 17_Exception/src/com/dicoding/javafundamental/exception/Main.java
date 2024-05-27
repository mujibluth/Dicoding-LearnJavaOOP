package com.dicoding.javafundamental.exception;

// import java.io.File;
// import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke-5 : " + a[5]);

            // mencoba membaca berkas IMG_3144.PNG
            // String location = "/Users/abdulmujiburrohmanluthfi/Downloads/IMG_3144.PNG";
            // File file = new File(location);
            // jika berhasil, maka tampilkan pesan
            // System.out.println("Read file berhasil");
        // } catch (Exception e) {
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);

            // jika terjadi kesalahan, maka tampilkan pesan kesalahan
            // System.out.println(e.getMessage());
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}
