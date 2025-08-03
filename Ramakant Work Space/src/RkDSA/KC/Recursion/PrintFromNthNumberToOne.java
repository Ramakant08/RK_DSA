package RkDSA.KC.Recursion;

public class PrintFromNthNumberToOne {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        n--;
        print(n);
    }
}
