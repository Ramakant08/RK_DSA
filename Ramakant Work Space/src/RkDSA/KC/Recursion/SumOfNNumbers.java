package RkDSA.KC.Recursion;

public class SumOfNNumbers {

    public static void main(String[] args) {
        int num=6;
        System.out.println(sum(num));
    }
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
