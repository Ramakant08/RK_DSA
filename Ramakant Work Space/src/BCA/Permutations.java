package BCA;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public  static List<List<Integer>>list;

    public static List<List<Integer>>permutate(int[]arr){
        list=new ArrayList<>();
        helper(arr,new ArrayList<>());
        return list;
    }

    private static void helper(int[] arr, List<Integer> ans) {
        if(ans.size()==arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
                helper(arr,ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(permutate(arr));
    }



}
