package RkDSA.KC.LeetCodeProblems;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int a;
        int b=0;
        int temp1=n;
        while (temp1>0){
            a=temp1%10;
            b= (int) (b+(a*Math.pow(10,count-1)));
            temp1=temp1/10;
            count--;
        }
        if(b==n)
        System.out.println("Palindorme");
        else
            System.out.println("not Palindrome");

    }
}
