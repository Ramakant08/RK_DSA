import java.util.Arrays;
import java.util.List;

public class Test {

//    Given a sorted integer array, two integers N and X, return the N closest integers to X in the array.
//            Input: N = 4, X = 35
//    arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56}
    //                      i      i
//    Output: 30 39 42 45
    //{1,5,20,21,22}
    //         i

    //N=2, X=22   20-1=19, 20-5=15, 21-20=1, 22-20=2;
    //{1,2};

    public static int[] closesIntegers(int[] arr, int N, int X) {
        int index = search(arr, X);
        int[] integers = new int[N];
        integers = findClosestInteger(arr, index, N);
        return integers;
    }

    private static int[] findClosestInteger(int[] arr, int index, int N) {
        int[] element = new int[N];
        int ptr1 = index - 1;
        int ptr2 = index + 1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(arr[index] - arr[ptr1]) < Math.abs(arr[index] - arr[ptr2])) {
                element[i] = arr[ptr1];
                ptr1--;
            } else {
                element[i] = arr[ptr2];
                ptr2++;
            }
        }
        return element;
    }

    public static int search(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (element > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int N = 4;
        int X = 35;
        System.out.println(Arrays.toString(closesIntegers(arr, N, X)));
    }

}

