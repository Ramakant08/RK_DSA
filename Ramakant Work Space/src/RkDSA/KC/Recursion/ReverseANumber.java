package RkDSA.KC.Recursion;

public class ReverseANumber {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(checkPalindrome(122));
    }


    public static boolean checkPalindrome(int a){
         if(a!=reverse(a)){
             return false;
         }
         return true;
    }
    public static int reverse(int a) {
        if (a > 0) {
            int count = calculateCount(a);
            return a % 10 * (int) Math.pow(10, count) + reverse(a / 10);
        }
        return a;
    }

    private static int calculateCount(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count - 1;
    }
}
