package RkDSA.KC.Searching;

public class PeakIndexInMountainArray {
    public static int searchPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 3, 2, 1};
        System.out.println(searchPeakIndex(arr));
    }
}
