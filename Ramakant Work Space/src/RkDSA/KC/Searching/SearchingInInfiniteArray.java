package RkDSA.KC.Searching;

public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 28};
        int target = 16;
        System.out.println(findTargetSubArray(arr, target));
    }

    public static int findTargetSubArray(int[] arr, int target) {
        int start = 0;
        int end = start + 1;
        //finding target subarray
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return search(arr, start, end, target);
    }

    public static int search(int[] arr, int start, int end, int target) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
