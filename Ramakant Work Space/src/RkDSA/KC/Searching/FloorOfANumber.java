package RkDSA.KC.Searching;

public class FloorOfANumber {
    public static int findFloorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 14, 16, 17, 18};
        System.out.println(arr[findFloorOfANumber(arr, 10)]);
    }
}
