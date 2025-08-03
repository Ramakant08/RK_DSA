package TopInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialPositionMatrix {
    static int solve(List<List<Integer>>  input){
        int[]rowCount=new int[input.size()];
        int []colCount=new int[input.get(0).size()];
        for(int i=0;i<input.size();i++){
            for(int j=0;j<input.get(i).size();j++){
                if(input.get(i).get(j)==1){
                    rowCount[i]=rowCount[i]+1;
                    colCount[j]=colCount[j]+1;
                }
            }
        }
        int count=0;
        for(int i=0;i<input.size();i++){
            for(int j=0;j<input.get(0).size();j++){
                if(input.get(i).get(j)==1&&rowCount[i]==1&&colCount[j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isValid(int indexRow,int indexCol,List<List<Integer>>input){
        if(indexRow<input.size()&&indexCol<input.get(0).size()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
        list.add(Arrays.asList(1,0,1));
        list.add(Arrays.asList(0,1,0));
        list.add(Arrays.asList(0,0,1));
        System.out.println(solve(list));
        }
}
