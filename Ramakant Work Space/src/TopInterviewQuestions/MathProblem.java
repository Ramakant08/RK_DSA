package TopInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathProblem {
    static int[] solve(int left,int right){
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
           if(i%10!=0&&selfDevide(i)){
                list.add(i);
            }
        }

        int[]arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }


    public static boolean selfDevide(int number){
        int temp=number;
        while(temp>0){
            if(number%(temp%10)!=0){
                return false;
            }else{
                temp=temp/10;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(9%10);
        System.out.println(Arrays.toString(solve(10, 20)));
    }
}
