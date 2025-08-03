package RkDSA.KC.Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(0, 1, arr)));
    }

    public static int[] sort(int i, int j, int[] sortedArr) {
        if (i == sortedArr.length) {
            return sortedArr;
        }

        if (j < sortedArr.length - i) {
            if (sortedArr[j] < sortedArr[j - 1]) {
                int temp = sortedArr[j - 1];
                sortedArr[j - 1] = sortedArr[j];
                sortedArr[j] = temp;
                return sort(i, j + 1, sortedArr);
            } else {
                return sort(i, j + 1, sortedArr);
            }
        } else {
            return sort(i + 1, 1, sortedArr);
        }
    }
}
