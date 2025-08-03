package RkDSA.KC.Recursion;

public class RemoveAllAs {
    public static void main(String[] args) {
        String string = "aaaabaaaahcsertt";
//        System.out.println(remove(string));
        String skip = "verfecxdeeapplefvcfd";
        System.out.println(skipString(skip,"fvcfd"));
    }

    public static String remove(String str) {
        if (str.isEmpty()) {
            return str;
        }

        if (str.charAt(0) != 'a') {
            return str.charAt(0) + remove(str.substring(1));
        } else {
            return remove(str.substring(1));
        }
    }

    public static String skipString(String skip, String toSkip) {
        if (skip.isEmpty()) {
            return skip;
        }

        if (skip.startsWith(toSkip)) {
            return skipString(skip.substring(toSkip.length()), toSkip);
        } else {
            return skip.charAt(0) + skipString(skip.substring(1), toSkip);
        }
    }
}
