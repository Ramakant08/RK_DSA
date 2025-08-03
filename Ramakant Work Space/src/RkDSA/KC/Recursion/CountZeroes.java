package RkDSA.KC.Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int n=10304000;
        System.out.println(count(n,0));
    }

    public static int count(int n,int counter){
        if(n<=0){
            return counter;
        }
        if(n%10==0){
            return count(n/10,counter+1);
        }
        return count(n/10,counter);
    }
}
