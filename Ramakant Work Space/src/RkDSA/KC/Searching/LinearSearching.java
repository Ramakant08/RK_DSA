package RkDSA.KC.Searching;

import java.util.Arrays;

public class LinearSearching {

    static String searchingIn1DArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return "element fount at index: " + i;
            }
        }
        return "element does not exist";
    }

    static String searchingIn2DArray(int array[][], int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    int[] a = {i, j};
                    return "element found at index: " + Arrays.toString(a);
                }
            }
        }

        return "element does not exist";
    }

    static String searchingInString(String str, char targetChar) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (str.charAt(i) == targetChar) {
                return "char fount at index: " + i;
            }
        }

        return "char does not exist";
    }


    public static void main(String[] args) {
        int array1D[] = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(searchingIn1DArray(array1D, 4));
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 7, 8}
        };
        System.out.println(searchingIn2DArray(array2D, 5));
        String string="Ramakant";
        System.out.println(searchingInString(string,'t'));

    }
}
