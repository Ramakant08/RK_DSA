package RkDSA.KC.LeetCodeProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String formattedString=str.replace(" ",",");

        String word="";
        List<String>list=Arrays.asList(formattedString.split(",",-1));
        for (int i = 0; i < list.size(); i++) {
            String  character="";
            for (int j = list.get(i).length()-1; j >=0; j--) {
                character=character+list.get(i).charAt(j);
            }
            word=word+character+" ";
        }
        System.out.println(word);
    }
}
