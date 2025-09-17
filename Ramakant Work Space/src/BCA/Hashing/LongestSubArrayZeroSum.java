package BCA.Hashing;

import java.util.HashMap;
import java.util.Map;

//[1, -1, 2, -2, 2, -2, -1, 1]
public class LongestSubArrayZeroSum {
    static int maxLen(int[] input) {
        int longestSize = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if (sum == 0) {
                longestSize = i + 1;
            }
            if (map.containsKey(sum)) {
                int currSize = i - map.get(sum);
                longestSize = Math.max(currSize, longestSize);
            } else {
                map.put(sum, i);
            }
        }
        return longestSize;
    }

    public static void main(String[] args) {
        System.out.println( maxLen(new int[]{1, 0, -1}));
    }
}
