package RkDSA.KC.Searching;

import java.util.Arrays;

public class BinarySearchInStrictlySortedArray {


    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        System.out.println(Arrays.toString(search(arr, 10)));
    }


    //search in the row provide
    public static int[] searchInRow(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = (cStart + cEnd) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        if (row == 1) {
            return searchInRow(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int col = cols / 2;
        while (rowStart < rowEnd - 1) {
            int mid = (rowStart + rowEnd) / 2;
            if (matrix[mid][col] == target) {
                return new int[]{mid, col};
            } else if (matrix[mid][col] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        //now we have two rows
        //search in these two rows
        if (matrix[rowStart][col] == target) {
            return new int[]{rowStart, col};
        }
        if (matrix[rowStart + 1][col] == target) {
            return new int[]{rowStart + 1, col};
        }

        if (target <= matrix[rowStart][col - 1]) {
            return searchInRow(matrix, rowStart, 0, col - 1, target);
        } else if (target >= matrix[rowStart][col + 1] && target <= matrix[rowStart][cols - 1]) {
            return searchInRow(matrix, rowStart, col + 1, cols - 1, target);
        } else if (target <= matrix[rowStart + 1][col - 1]) {
            return searchInRow(matrix, rowStart + 1, 0, col - 1, target);
        } else {
            return searchInRow(matrix, rowStart + 1, col + 1, cols - 1, target);
        }
    }


}
