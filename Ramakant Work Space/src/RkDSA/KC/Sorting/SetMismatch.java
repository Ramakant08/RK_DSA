package RkDSA.KC.Sorting;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1, 2,2};
        System.out.println(Arrays.toString(searchMismatchElements(arr)));
    }

    public static int[] searchMismatchElements(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        int[] repArr = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                repArr[0] = arr[j];
                repArr[1] = j + 1;
            }
        }
        return repArr;
    }
}
