package RkDSA.KC.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2, 0,9,6,8};
        System.out.println(Arrays.toString(performInsertionSort(arr)));
    }

    public static int[] performInsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void swap(int arr[], int second, int first) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
