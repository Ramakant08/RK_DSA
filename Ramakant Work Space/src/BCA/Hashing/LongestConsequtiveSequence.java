package BCA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsequtiveSequence {
    static int solve(int[] input) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            map.put(input[i], false);
        }
        int maxLength = 0;
        for (int i = 0; i < input.length; i++) {
            int length = 1;
            int prevElement = input[0] - 1;
            while (map.containsKey(prevElement) && !map.get(prevElement)) {
                length++;
                map.put(prevElement, true);
                prevElement--;

            }

            int nextElement = input[0] + 1;
            while (map.containsKey(nextElement) && !map.get(nextElement)) {
                length++;
                map.put(nextElement, true);
                nextElement++;
            }

            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
