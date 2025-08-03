package RkDSA.KC.Sorting;

import java.util.List;
import java.util.ArrayList;

public class FindAllRepeatedNumbers {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(arrList(arr));
    }

    public static List<Integer> arrList(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(arr[j]);
            }
        }

        return list;

    }
}
