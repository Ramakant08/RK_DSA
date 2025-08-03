package RkDSA.KC.Searching;

public class CielingOfANumber {
    public static int ceilingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 16, 17, 18};
        System.out.println(arr[ceilingSearch(arr, 15)]);
    }
}
