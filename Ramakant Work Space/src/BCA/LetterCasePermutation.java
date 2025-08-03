package BCA;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    static List<String> list;

    public static List<String> letterCasePermutation(String s) {
        list = new ArrayList<>();
        helper(s, "", 1);
        return list;
    }

    public static void helper(String original, String formed, int start) {
        if (original.isEmpty()) {
            list.add(new String(formed));
            return;
        }

        for (int i = start; i < original.length(); i++) {
            if (i > start && original.charAt(i-1) == original.charAt(i - 2)) {
                String prefix = original.substring(0, i);
                String postfix = original.substring(i);
                formed += prefix;
                helper(postfix, formed, i+1);
                formed.replace(String.valueOf(formed.charAt(formed.length() - 1)), "");
            }

        }
    }

    public static void main(String[] args) {
//        char a = 'a' - 32;
        System.out.println(letterCasePermutation("a1b2"));
    }
}

