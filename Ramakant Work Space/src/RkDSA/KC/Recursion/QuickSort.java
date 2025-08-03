package RkDSA.KC.Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8, 76, 4, 6, 4, 3, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int peak = mid;
        while (start <end) {
            while (arr[start] < peak) {
                start++;
            }
            while (arr[end] > peak) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        sort(arr, low, high);
        sort(arr, start, end);
    }
}
