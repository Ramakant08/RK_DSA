package RkDSA.KC.LeetCodeProblems;

public class HTMLReading {
    public  static String Rem (String str) {
        String s = "";
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - 3) {
                if (str.substring(i, i + 3).equals("yak")){
                    i = i + 2;
                } else {
                    s = s + str.charAt(i);
                }
                i++;
            }
            else {
                s = s + str.charAt(i);
                i++;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println( Rem("asfsfdvdyak"));
    }
}
