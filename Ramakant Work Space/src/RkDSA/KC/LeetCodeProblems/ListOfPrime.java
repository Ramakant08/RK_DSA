package RkDSA.KC.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class ListOfPrime {
    public static void main(String[] args) {
        //adding comments to the code
        List<Integer> list = new ArrayList<>();
        int n = 37;
        int n1=0;
        for (int i = 2; i <= n; i++) {
            n1=0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0){
                    n1=1;
                    break;
                }
            }
            if(n1==0)
           list.add(i);
        }
        System.out.println(list);
    }
}
