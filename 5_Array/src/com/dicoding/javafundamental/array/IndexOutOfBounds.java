package com.dicoding.javafundamental.array;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] arrA = new int[]{1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        // Akses indeks ke-4
        System.out.println(arrA[4]);
    }
}
