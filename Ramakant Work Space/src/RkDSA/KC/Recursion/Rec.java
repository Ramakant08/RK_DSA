package RkDSA.KC.Recursion;

public class Rec {


    public static int[] bubblesort(int i, int j, int[] arr) {
        if (i == arr.length) {
            return arr;
        }

        if (j < arr.length - i) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                return bubblesort(i, j + 1, arr);
            } else {
                return bubblesort(i, j + 1, arr);
            }
        } else {
            return bubblesort(i + 1, 1, arr);
        }
    }
}
