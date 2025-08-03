package BCA;

import java.util.Arrays;

public class codefile {
    static int[] solve(int[] input, int k, int x) {
        int index = helper(input, x);
        System.out.println(index);
        return getNumbers(input, index, k, x);
    }

    public static int helper(int[] input, int x) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            System.out.println("Enter");
            int mid = start + (end - start) / 2;
            if (input[mid] == x) {
                return mid;
            } else if (x > input[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Exit");
        return -1;
    }

    public static int[] getNumbers(int[] input, int index, int k, int x) {
        int[] arr = new int[k];
        int count = 0;
        int prev = index - 1;
        int next = index + 1;
        for (int i = 1; i <= k; i++) {
            if (prev >= 0 && x - input[prev] <= input[next] - x) {
                arr[count++] = input[prev];
                prev--;
            } else  {
                arr[count++] = input[next];
                next++;
            }
        }
        System.out.println("Exit2");
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(solve(arr, 5, 3)));
    }
}