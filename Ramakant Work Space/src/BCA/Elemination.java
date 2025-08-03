package BCA;

import java.util.ArrayList;
import java.util.List;

public class Elemination {

    static int solve(int n){

        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }
       return helper(n,arr,0);

    }

    static int helper(int n, int[]arr,int round){
        if(n==1){
            return arr[0];
        }

        if(round%2==0){
            List<Integer> list=new ArrayList<>();
            for (int i = 1; i < arr.length; i+=2) {
                list.add(arr[i]);
            }
            int[]ans=new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i]=list.get(i);
            }
            return helper(ans.length,ans,round+1);
        }else{
            int count=0;
            List<Integer> list=new ArrayList<>();
            for (int i =arr.length-2; i >=0; i=i-2) {
                list.add(arr[i]);
            }
            int[]ans=new int[list.size()];
            for (int i = list.size()-1; i >=0; i--) {
                ans[count++]=list.get(i);
            }
          return helper(ans.length,ans,round+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(9));
    }
}
