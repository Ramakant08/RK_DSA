package RkDSA.KC.Searching;

import java.util.Arrays;

public class FirstAndLastIndex {
    //Find the first and last index of a number in a sorted array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 7, 7, 7, 8, 8, 9};
        int target = 8;
        System.out.println(Arrays.toString(findIndex(arr, target)));
    }

    public static int[] findIndex(int[] arr, int target) {
        int[] indexArr = {-1, -1};
        indexArr[0] = search(arr, target, true);
        indexArr[1] = search(arr, target, false);
        return indexArr;
    }

    public static int search(int[] arr, int target, boolean findFirstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
