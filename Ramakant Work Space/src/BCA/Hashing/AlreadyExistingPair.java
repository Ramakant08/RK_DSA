package BCA.Hashing;

import java.util.*;

//. Find pairs in array whose sums already exist in array
public class AlreadyExistingPair {
    public static List<List<Integer>> solve(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(arr[i] + arr[j])) {
                    list.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return list;
    }
}
