package RkDSA.KC.LeetCodeProblems;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[]arr={5,6,2,8,9};
        System.out.println("Maximum value is: "+max(arr));
        System.out.println(Arrays.toString(swap(arr,2,4)));
        System.out.println(Arrays.toString(reverse(arr)));

    }
    static int max(int[]arr){
        int maxVal=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static int[] reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

    static int[] swap(int[]arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
}
