package RkDSA.KC.LeetCodeProblems;

import java.util.Scanner;

public class NewClass {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        for(int i=a;i<=b;i++){
            int count =2;
            while(count*count<=i){
                if(i%count==0){
                    System.out.println(i+" is not a prime");
                    break;
                }
                count++;
            }
            if(count*count>i){
                System.out.println(i+" is a prime");
            }

        }
    }
}
