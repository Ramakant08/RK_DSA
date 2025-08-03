package RkDSA.KC.Searching;

import java.util.Arrays;

public class BinarySearchingIn2DArray {

    public static int[] binarySearchIn2D(int[][] arr, int target) {
        int rowStart = 0;
        int colStart = arr[0].length - 1;
        while (rowStart <= arr.length-1) {
            if (arr[rowStart][colStart] == target) {
                return new int[]{rowStart, colStart};
            } else if (arr[rowStart][colStart] > target) {
                colStart--;
            } else {
                rowStart++;
            }
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 9},
                {6, 7, 10, 11},
                {8, 12, 14, 15},
                {13, 16, 17, 18}};
        int target = 15;
        System.out.println(Arrays.toString(binarySearchIn2D(arr, target)));
    }
}
