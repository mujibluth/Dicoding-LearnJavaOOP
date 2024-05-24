public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;

        System.out.println("Sama dengan..");
        result = value == anotherValue; // 1. equal to
        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue; // 2. not equal to
        System.out.println("Hasil 'value != anotherValue' adalah " + result );
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue; // 3. greather then
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue; // 4. greather then or equal to
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue; // 5. less than
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue; // 6. less then or equal to
        System.out.println("Hasil 'value <= anotherValue' adalah " + result);
        System.out.println();
    }
}
