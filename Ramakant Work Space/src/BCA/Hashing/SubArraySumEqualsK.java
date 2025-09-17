package BCA.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySumEqualsK {
//    public int subarraySum(int[] nums, int k) {
//        Map<Integer,Integer> map=new HashMap<>();
//        map.put(0,1);
//        int ans=0;
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//            if(map.containsKey(sum-k)){
//                ans+=map.get(sum-k);
//            }
//            if(map.containsKey(sum)){
//                map.put(sum,map.get(sum)+1);
//            }else{
//                map.put(sum,1);
//            }
//        }
//        return ans;
//    }

    static List<List<Integer>> solve(String[] input){
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i].charAt(0)!=input[j].charAt(input[j].length()-1)){

                }else{
                    String str=input[i]+input[j];
                    if(checkPalindrome(str)){
                        List<Integer> currList=new ArrayList<>();
                        currList.add(i);
                        currList.add(j);
                        list.add(currList);
                    }
                }
                if(input[j].charAt(0)!=input[i].charAt(input[i].length()-1)){

                }else{
                    String str=input[j]+input[i];
                    if(checkPalindrome(str)){
                        List<Integer>currList=new ArrayList<>();
                        currList.add(j);
                        currList.add(i);
                        list.add(currList);
                    }
                }
            }
        }
        return list;
    }

    public static boolean checkPalindrome(String str){
        int r=str.length()-1;
        int l=0;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((solve(new String[]{"abcd","dcba","lls","s","sssll"})));
    }
}
