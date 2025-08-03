package RkDSA.KC.Recursion;

public class NthFibonacciNumber {


    public static void main(String[] args) {
        int n=fibo(5);
        System.out.println(n);
    }

    //logic is nth term of fibonacci sequnce is the sum of n-1 and n-2 term
    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
