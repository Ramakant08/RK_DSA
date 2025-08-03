package RkDSA.KC.Recursion;

public class SearchInRotatedSort {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 3, 4};
        System.out.println(search(arr, 9, 0, 5));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > arr[start]) {
            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, target, start, mid);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }
        if (target > arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }

    }
}
