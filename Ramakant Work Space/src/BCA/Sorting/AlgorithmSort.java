package BCA.Sorting;


import RkDSA.KC.Sorting.SelectionSort;

import java.util.Arrays;

public class AlgorithmSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j + 1] = key;
        }
    }

    public static void mergerSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        mergerSort(arr, l, mid);
        mergerSort(arr, mid + 1, r);
        mergerArraysAndSort(arr, l, mid, r);
    }

    private static void mergerArraysAndSort(int[] arr, int l, int mid, int r) {
        int[] arrLeft = new int[mid - l + 1];
        int[] arrRight = new int[r - mid];
        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[l + i];
        }
        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                arr[k++] = arrLeft[i++];
            } else {
                arr[k++] = arrRight[j++];
            }
        }

        while (i < arrLeft.length) {
            arr[k++] = arrLeft[i++];
        }

        while (j < arrRight.length) {
            arr[k++] = arrRight[j++];
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, high, i + 1);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
//      selectionSort(arr);
//        insertionSort(arr);
//        mergerSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}

