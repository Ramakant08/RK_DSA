package BCA;

import java.util.ArrayList;
import java.util.List;

public class permutation2 {

    static List<List<Integer>> list;

    static List<List<Integer>> solve(int[] input) {
        list = new ArrayList<>();
        boolean[] arr = new boolean[input.length];
        helper(input, new ArrayList<>(), arr);
        return list;
    }

    public static void helper(int[] input, List<Integer> ans, boolean[] arr) {
        if (ans.size() == input.length && !list.contains(ans)) {
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (!arr[i]) {
                ans.add(input[i]);
                arr[i] = true;
                helper(input, ans, arr);
                arr[i] = false;
                ans.remove(ans.size() - 1);

            }
        }
    }


    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 2}));
    }
}
