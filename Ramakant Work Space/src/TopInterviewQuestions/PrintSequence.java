package TopInterviewQuestions;

import java.util.Arrays;

public class PrintSequence {
    static int[] solve(int n){
        int []arr=new int[n];
        return print(n,arr);
    }

    static int[]print(int n, int[]arr){
        if(n==0){
            return arr;
        }
        arr[n-1]=n;
        return print(n-1,arr);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(5)));
    }


}
