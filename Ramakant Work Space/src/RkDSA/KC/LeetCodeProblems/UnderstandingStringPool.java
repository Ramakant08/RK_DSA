package RkDSA.KC.LeetCodeProblems;

public class UnderstandingStringPool {

    public static void main(String[] args) {
        String str1 = "Ramakant";
        String str2 = "Ramakant";
        String str3 = new String("Ramakant");
        String str4 = new String("Ramakant");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str4));
    }
}
