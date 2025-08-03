package TopInterviewQuestions;

import java.util.HashMap;

public class SubArraySumEqualsKopt {
    public static int[] getSum(int[] arr, int sum) {
        int start = 0;
        int end = -1;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum - sum == 0) {
                start = 0;
                end = 0;
            }
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = i;
            }
            map.put(currentSum - sum, i);
        }

        if (end == -1) {
            return new int[]{-1, -1};
        } else {
            return new int[]{start, end};
        }
    }
}
