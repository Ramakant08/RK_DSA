package RkDSA.KC.LeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[][]arr2D=new int[4][3];
        System.out.println(arr2D.length);
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j <arr2D[i].length; j++) {
                arr2D[i][j]=sc.nextInt();
            }
        }

        for (int[]k:arr2D) {
            System.out.println(Arrays.toString(k));
        }

  //TODO-DYNAMIC 2D ARRAYS
        int [][] dynami2D={
                {1,2,3,4},
                {1,2,3},
                {2,5,6,6,7}
        };
        for (int i = 0; i <dynami2D.length ; i++) {
            for (int j = 0; j <dynami2D[i].length ; j++) {
                System.out.print(dynami2D[i][j]+" ");
            }
            System.out.println();
        }

        for (int[]l:
             dynami2D) {
            System.out.println(Arrays.toString(l));
        }

}
}

