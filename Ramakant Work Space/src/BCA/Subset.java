package BCA;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> list;

    public static List<List<Integer>> findSubset(int[] arr) {
        list = new ArrayList<>();
        helper(arr, new ArrayList<>(), 0);
        return list;
    }

    public static void helper(int[] arr, List<Integer> ans, int start) {
        if (!list.contains(ans))
            list.add(new ArrayList<>(ans));
//        System.out.println(list);
        for (int i = start; i < arr.length; i++) {

            ans.add(arr[i]);
            helper(arr, ans, i + 1);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 1, 4};
        System.out.println(findSubset(arr));
    }
}
