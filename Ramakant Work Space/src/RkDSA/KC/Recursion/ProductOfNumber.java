package RkDSA.KC.Recursion;

public class ProductOfNumber {
    public static void main(String[] args) {
        int num = 5076;
        System.out.println(product(num));
    }

    public static int product(int num) {
        if (num <= 0) {
            return 1;
        }

        return (num % 10) * product(num / 10);
    }
}
