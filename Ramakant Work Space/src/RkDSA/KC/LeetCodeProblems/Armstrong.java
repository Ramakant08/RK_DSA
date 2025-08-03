package RkDSA.KC.LeetCodeProblems;

public class Armstrong {
    //revisited the armstrong and the prime number code
    static boolean armString(int n){
        int temp =n;
        int temp1 =n;
        int a,b=0,c;

        while (temp>0){
            a=temp%10;
            b=b+a*a*a;
            temp=temp/10;
        }
        return b==n;
    }
    static  boolean prime(int n){
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            else c++;
        }
        return c*c>n;
    }



    public static void main(String[] args) {
//       for (int i=100;i<1000;i++){
//           if(armString(i)){
//               System.out.println(i);
//           }
//       }
       System.out.println(prime(41));

    }

}
