package RkDSA.KC.Recursion;

import java.util.ArrayList;

public class SubsetIterationWay {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        ArrayList<ArrayList<Integer>> list = subsetsDuplicate(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for (int i : arr) {
            int n = outerList.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);

            }
        }

        return outerList;
    }

    public static ArrayList<ArrayList<Integer>> subsetsDuplicate(int[] arr) {
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length ; i++) {
            int n = outerList.size();
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outerList.size() - 1;
            for (int j = start; j < n; j++) {
                ArrayList<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);

            }
        }

        return outerList;
    }
}
