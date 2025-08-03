package BCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSumPart2 {

    static List<List<Integer>> list;

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, new ArrayList<>(), 0, 0, target);
        return list;
    }

    public static void helper(int[] input, List<Integer> ans, int start, int sum, int target) {
        if (sum > target) {
            return;
        } else if (sum == target) {
            list.add(new ArrayList<>(ans));
            return;
        }

        for (int i = start; i < input.length; i++) {
            if (i > start && input[i] == input[i - 1]) continue;
            ans.add(input[i]);
            helper(input, ans, i + 1, sum + input[i], target);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 30));
    }
}
