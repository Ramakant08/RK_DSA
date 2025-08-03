package BCA.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KsmallestSum {
    static List<List<Integer>> solve(int[] input1, int[] input2, int k) {
        int count = 1;
        int input1Ptr = 0;
        int input2Ptr = 0;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(input1[input1Ptr], input2[input2Ptr]));
        while (count < k) {
            if (input2Ptr < input2.length-1&& input1[input1Ptr + 1] > input2[input2Ptr + 1]) {
                input2Ptr++;
                list.add(Arrays.asList(input1[input1Ptr], input2[input2Ptr]));
                count++;
            } else {
                input1Ptr++;
                list.add(Arrays.asList(input1[input1Ptr], input2[input2Ptr]));
                count++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {1,2,3};
        System.out.println(solve(arr1, arr2, 2));
    }
}
