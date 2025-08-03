package RkDSA.KC.Sorting;

import java.util.Arrays;

public class FindFirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = {-1, 1, 4, 3, 2};
        System.out.println(searchFirstMissingPositive(arr));

    }

    public static int searchFirstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length;
    }
}
