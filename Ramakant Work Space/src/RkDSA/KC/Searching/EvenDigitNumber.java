package RkDSA.KC.Searching;

public class EvenDigitNumber {

    static int evenDigitNumberCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEvenDigit(array[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEvenDigit(int i) {
        int count = 0;
        while (i > 0) {
            count++;
            i = i / 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {213, 2244, 6123, 22, 4357, 5, 123};
        System.out.println(evenDigitNumberCount(array));
    }
}
