package RkDSA.KC.Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }

    public static int factorialOfNumber(int n) {
        if (n <= 1) {
            return n ;
        }


        return n * factorialOfNumber(n - 1);


    }
}
