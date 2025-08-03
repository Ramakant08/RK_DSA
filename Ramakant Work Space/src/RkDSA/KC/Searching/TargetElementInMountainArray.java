package RkDSA.KC.Searching;

public class TargetElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 2, 0};
        int target = 5;
        System.out.println(findingTargetElement(arr, target));
    }

    public static int findingTargetElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int peakElement = findPeakElement(arr);
        int firstHalfResult = search(arr, target, start, peakElement);
        if (firstHalfResult != -1) {
            return firstHalfResult;
        }
        return search(arr, target, peakElement + 1, end);
    }

    private static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] < arr[end]) {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
