package BCA;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    static List<List<String>>list;
    public static List<List<String>> partition(String s) {
        list=new ArrayList<>();
        helper(s,new ArrayList<>());
        return list;
    }

    public static void helper(String s, ArrayList<String>ans){
        if(s.isEmpty()){
            list.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 1; i <=s.length() ; i++) {
            String prefix=s.substring(0,i);
            String remainingPart=s.substring(i);
            if(isPalindrome(prefix)){
                ans.add(prefix);
                helper(remainingPart,ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("abaaba"));
    }
}
