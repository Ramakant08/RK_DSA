package RkDSA.KC.LeetCodeProblems;

public class SquareRootOfNumber {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 4, 6};
        System.out.println(HigestSum(arr, 2));
    }

    public static int HigestSum(int[] arr, int m) {

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (num + sum > mid) {
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
