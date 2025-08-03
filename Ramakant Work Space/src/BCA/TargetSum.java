package BCA;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

    static List<List<Integer>> list;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        list = new ArrayList<>();
        helper(candidates, target, new ArrayList<>(), 0,0);
        return list;
    }

    public static void helper(int[] input, int target, List<Integer> ans, int sum,int start) {
        if (sum > target) {
            return;
        } else if (sum == target) {

            list.add(new ArrayList<>(ans));
//            System.out.println(list);

            return;
        }

        for (int i = start; i < input.length; i++) {   //start because we don't want loop to start from zero every time once we have added the combination
            ans.add(input[i]);
//            Collections.sort(ans);
            helper(input, target, ans, sum + ans.get(ans.size() - 1), i);
            ans.remove(ans.size() - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
    }
}
