package BCA.Recursion;

public class StringPermutation {
    public static void main(String[] args) {
      permutation("","abs");
    }

    public static void permutation(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        String s = unProcessed.charAt(0) + "";
        for (int i = 0; i <= processed.length(); i++) {
            String left = processed.substring(0, i);
            String right = processed.substring(i);
            permutation(left + s + right, unProcessed.substring(1));
        }
    }
}
