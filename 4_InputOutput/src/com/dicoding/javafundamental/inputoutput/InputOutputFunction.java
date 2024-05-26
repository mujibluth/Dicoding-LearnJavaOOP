package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka pertama : "); 
        int value = scanner.nextInt();
        System.out.print("Masukan angka kedua : "); 
        int anotherValue = scanner.nextInt();
        // Adapun catatan yang harus diperhatikan adalah penggunaan fungsi Scanner. Pengambilan data sangat bergantung pada tipe data yang dimasukan. Ini harus sesuai, misalnya untuk string, panggilah ``Scanner.next()```. Jika data yang diinputkan Integer, panggilah Scanner.nextInt(). Jika input tidak sesuai, program akan menemui eror.
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}

