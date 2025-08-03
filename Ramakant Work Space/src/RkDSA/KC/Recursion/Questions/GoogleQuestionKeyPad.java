package RkDSA.KC.Recursion.Questions;

import java.util.ArrayList;

public class GoogleQuestionKeyPad {

    public static void main(String[] args) {
        String s="12";
        System.out.println(pad("",s));
    }

    public static ArrayList<String> pad(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String>combinationList=new ArrayList<>();
        int digit=unProcessed.charAt(0)-'0';  //for setting limit or range for number
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch= (char) +('a'+i);   // for adding character to  combination
            combinationList.addAll(pad(processed+ch,unProcessed.substring(1)));
        }

        return combinationList;
    }
}
