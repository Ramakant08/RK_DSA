package BCA.DP;

public class Fibonacci {

    public static int fiboMemoization(int n, int[] arr) {
        if (n <= 1) {
            return n;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        int previous = fiboMemoization(n - 1, arr);
        int previousToPrevious = fiboMemoization(n - 2, arr);
        arr[n] = previous + previousToPrevious;
        return arr[n];
    }

    public static int fiboTabulation(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-1, -1, -1, -1, -1, -1};
//        System.out.println(fiboMemoization(5, arr));
        System.out.println(fiboTabulation(3));
    }
}
