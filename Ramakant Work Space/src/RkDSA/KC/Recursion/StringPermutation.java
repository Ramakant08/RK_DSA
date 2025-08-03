package RkDSA.KC.Recursion;

import java.util.ArrayList;

public class StringPermutation {

    public static void main(String[]arg){
        permutation("","abc");
    }

    public static void permutation(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }


        String s = "" + unProcessed.charAt(0);
        for (int i = 0; i < processed.length() + 1; i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            permutation(first + s + second, unProcessed.substring(1));
        }
    }

}
