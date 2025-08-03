package RkDSA.KC.Sorting;

import java.util.List;
import java.util.ArrayList;

public class FindAllMissingNumbers {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 7};
        System.out.println(nums(arr));
    }

    public static List<Integer> nums(int[] arr) {
        int i = 0;
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
        List<Integer> lst = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                lst.add(j + 1);
                j = j + 1;
            }
        }

        return lst;
    }
}

