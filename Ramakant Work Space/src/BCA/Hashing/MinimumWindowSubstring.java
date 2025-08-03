package BCA.Hashing;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {

    static String solve(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        //ADOBECODEBANC
        int minLength = Integer.MAX_VALUE;
        while (start < s.length() && end < s.length()) {
            if (end - start + 1 >= t.length() && isPresent(s.substring(start, end + 1), t)) {
                if ((end - start + 1) < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                    minEnd = end;
                }

                start++;
            } else {
                end++;
            }
        }

        return s.substring(minStart, minEnd + 1);
    }

    public static boolean isPresent(String sub, String t) {
        for (String s : t.split("")) {
            if (!sub.contains(s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(solve(s, t));
    }
}
