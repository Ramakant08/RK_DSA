package RkDSA.KC.LeetCodeProblems;

import java.util.Arrays;
import java.util.List;

public class Pangram {
// the panagram program
    public static String checkPanagram(String sentence){
        char [] chars1=sentence.toCharArray();
        String str1="abcdefghijklmnopqrstuvwxyz";
        char[]chars2=str1.toCharArray();
        int flag=0;
        for (int i = 0; i <chars2.length; i++) {
            for (int j = 0; j <chars1.length; j++) {
                if(chars2[i]==chars1[j]){
                    flag++;
                }
            }
            if(flag==0){
                return "not panagram";
            }
            flag=0;
        }
      return "panagram";
    }
    public static void main(String[] args) {
        //String str="jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        String str="abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkPanagram(str));
        List<String>list=Arrays.asList("asda","afsdf","rterf");

    if(str.length()<5){
        System.out.println();
    }else{
        if (str.length()>8)
            System.out.println();
    }

    }
}
