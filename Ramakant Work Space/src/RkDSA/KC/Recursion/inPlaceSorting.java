package RkDSA.KC.Recursion;

import java.util.Arrays;

public class inPlaceSorting {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 9, 8, 7};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] newArr = new int[end-start];
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                newArr[k] = arr[i];
                i++;

            } else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            newArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            newArr[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < newArr.length; l++) {
            arr[start + l] = newArr[l];
        }
    }
}
