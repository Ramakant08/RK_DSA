package TopInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class GenerateSpiralMatrix {
    static List<List<Integer>> solve(int N) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer>list1=new ArrayList<>();
            for (int j = 0; j <N ; j++) {
                list1.add(0);
            }
            list.add(list1);
        }
        int minRow = 0;
        int maxCol = N - 1;
        int maxRow = N - 1;
        int minCol = 0;
        int count = 1;
        while (count<=N*N){
            for (int j = minCol; j <= maxCol && count <= N * N; j++) {
                list.get(minRow).set(j, count);
                count++;
            }
            minRow++;
            for (int j = minRow; j <= maxRow && count <= N * N; j++) {
                list.get(j).set(maxCol, count);
                count++;
            }
            maxCol--;
            for (int j = maxCol; j >= minCol && count <= N * N; j--) {
                list.get(maxRow).set(j, count);
                count++;
            }
            maxRow--;
            for (int j = maxRow; j >= minRow && count <= N * N; j--) {
                list.get(j).set(minCol, count);
                count++;
            }
            minCol++;
        }
        return list;
    }

    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        System.out.println(solve(4));
    }
}
