package TopInterviewQuestions;

import java.util.Arrays;

public class MinimumSwap {
    public static int[] build(int[] input) {
        int j = 0;
        int s = 0;
        for (int i = input.length - 2; i >= 0; i--) {
            if (input[i] < input[i + 1]) {
                s = i;
                j = 1;
                break;
            }
        }

        int k = 0;
        int l = input.length - 1;
        if (j == 0) {
            while (k < l) {
                int temp = input[k];
                input[k] = input[l];
                input[l] = temp;
                k++;
                l--;
            }
        }else {
            int max = 19999;
            int b = 0;
            for (int p = input.length - 1; p > s; p--) {
               if(Math.abs(input[p]-input[s])<max&&input[p]>input[s]){
                   max=Math.abs(input[p]-input[s]);
                   b=p;               }
            }

            int temp1 = input[s];
            input[s] = input[b];
            input[b] = temp1;
            k=s+1;
            l=input.length-1;
            while (k < l) {
                int temp = input[k];
                input[k] = input[l];
                input[l] = temp;
                k++;
                l--;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(build(new int[]{2,3,1})));
    }

}
