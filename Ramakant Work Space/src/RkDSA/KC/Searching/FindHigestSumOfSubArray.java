package RkDSA.KC.Searching;

public class FindHigestSumOfSubArray {

    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 7, 4, 6};
        int sum = findSum(arr, 2);
        System.out.println(sum);
    }

    public static int findSum(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end) {
            //try for mid as potential answer
            int mid = (start + end) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // so you add this in new sub array, then sum=num;
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
