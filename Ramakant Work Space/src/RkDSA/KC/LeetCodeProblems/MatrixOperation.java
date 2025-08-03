package RkDSA.KC.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class MatrixOperation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 5};
        int target = 5;
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        System.out.println("first index" + list.indexOf(5));
        System.out.println("last index of" + list.lastIndexOf(5));
    }
}
