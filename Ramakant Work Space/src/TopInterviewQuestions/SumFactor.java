package TopInterviewQuestions;

import java.util.Arrays;

public class SumFactor {
    static int solve(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j * j <= input[i]; j++) {
                if (input[i] % j == 0) {
                    if (j * j == input[i]) {
                        sum += j;
                        System.out.println(j);
                    } else {
                        sum += j + input[i] / j;
                        System.out.println(j + " " + input[i] / j);
                    }
                }
            }
        }
        return sum;

    }

    static int count(int[]  input){
        int count=1;
        int max=0;
        
        for(int i=1;i<input.length;i++){
            if(input[i]==input[i-1]&&input[i]==1){
                count++;
            }else{
                count=1;
            }
            max=Math.max(count,max);
        }
        if(count==1){
            return 0;
        }
        return max;
    }
    static String solve(int n) {
        StringBuilder col = new StringBuilder();
        while (n > 0) {
            n--;  // Adjust to 0-indexed for easier mapping
            int rem = n % 26;
            col.insert(0, (char)('A' + rem));
            n /= 26;
        }
        return col.toString();
    }

    public static void main(String[] args) {
//        System.out.println(solve(new int[]{21, 4, 7}));
//        System.out.println(count(new int[]{0 ,0}));
        System.out.println(solve(52));
    }
}









