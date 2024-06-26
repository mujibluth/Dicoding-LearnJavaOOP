package com.dicoding.javafundamental.operator1;

public class OperatorConditional {
    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;

        // ---------------------------------------------
        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;

        System.out.println("Hasil operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();

        // ---------------------------------------------
        System.out.println("Conditional OR");
        boolean result2 = value == 3 || anotherValue == 3;
        boolean anotherResult2 = value != 3 || anotherValue == 5;

        System.out.println("Hasil operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result2);
        System.out.println("Hasil operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult2);
        System.out.println();
    }
}

