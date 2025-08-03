package RkDSA.KC.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 546;
        System.out.println(sum(num));
    }

    public static int sum(int num) {
        if (num == 0) {
            return num;
        }
        return (num % 10) + sum(num / 10);
    }
}
