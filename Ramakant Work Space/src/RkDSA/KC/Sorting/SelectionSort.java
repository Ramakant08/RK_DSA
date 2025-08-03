package RkDSA.KC.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(selectionSorArray(arr)));
    }

    public static int[] selectionSorArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxElementIndex = findMaxElementIndex(arr, 0, lastIndex);
            swapElement(arr, maxElementIndex, lastIndex);
        }
        return arr;
    }

    public static int findMaxElementIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swapElement(int[] arr, int maxElementIndex, int lastIndex) {
        int temp = arr[maxElementIndex];
        arr[maxElementIndex] = arr[lastIndex];
        arr[lastIndex] = temp;

    }
}
