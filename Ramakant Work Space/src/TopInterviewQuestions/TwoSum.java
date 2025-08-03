package TopInterviewQuestions;

import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (intMap.containsKey(arr[i])) {
                return new int[]{intMap.get(arr[i]),i};
            } else {
                intMap.put(Math.abs(target - arr[i]), i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int target= 6;
        int[]arr={1,2,4,5};
        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }
}
