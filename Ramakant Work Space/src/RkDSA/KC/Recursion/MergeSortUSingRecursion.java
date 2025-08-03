package RkDSA.KC.Recursion;


import java.util.Arrays;

public class MergeSortUSingRecursion {

    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 3};
        System.out.println(Arrays.toString(merge(arr)));
    }

    public static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] first = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] second = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return sortAndMerge(first, second);
    }

    public static int[] sortAndMerge(int[] left, int[] right) {
        int[] newArr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                newArr[k] = left[i];
                i++;
            } else {
                newArr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            newArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            newArr[k] = right[j];
            j++;
            k++;
        }

        return newArr;
    }
}
