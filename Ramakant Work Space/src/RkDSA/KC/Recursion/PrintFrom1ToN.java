package RkDSA.KC.Recursion;

public class PrintFrom1ToN {
    public static void main(String[] args) {
        print(5);

    }
    public static void print(int n){
        if(n==1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
