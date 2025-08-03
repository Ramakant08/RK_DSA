package RkDSA.KC.LeetCodeProblems;

import java.util.Scanner;

public class PatternFormation {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();


        for (int i = 0; i < length / 2 + 1; i++) {
            if (i <= length / 2) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                int a = length % 2 == 0 ? length - (i * 2) + 1 : length - (i * 2);
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        for (int i = 0; i < length / 2+1; i++) {
            for (int j = 0; j < length / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
