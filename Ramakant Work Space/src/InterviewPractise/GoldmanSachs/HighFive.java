package InterviewPractise.GoldmanSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighFive {
    public static int[][]average(int[][]scores ){
        Map<Integer,Integer> map=new HashMap<>();
        for(int[]score:scores){
            if(map.containsKey(score[0])){
                map.put(score[0],map.get(score[0])+score[1]);
            }else{
                map.put(score[0],score[1]);
            }
        }
        int[][]arr=new int[map.size()][2];
        int count=0;
        for(int i: map.keySet()){
            map.put(i,map.get(i)/5);
            arr[count][0]=i;
            arr[count][1]=map.get(i);
            count++;
        }
       return arr;
    }
    public static void main(String[] args) {
         int [][]items={{1,91},{1,92}};
        System.out.println(Arrays.toString(average(items)));
    }
}
