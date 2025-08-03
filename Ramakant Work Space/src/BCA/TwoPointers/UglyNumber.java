package BCA.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber {
    static int solve(int n) {
        int size = n;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while (list.size() < n) {
            int n1 = list.get(p1) * 2;
            int n2 = list.get(p2) * 3;
            int n3 = list.get(p3) * 5;
            int min = Math.min(n1, Math.min(n2, n3));
            list.add(min);
            if (min == n1) p1++;
            if (min == n2) p2++;
            if (min == n3) p3++;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(solve(10));
    }
}
