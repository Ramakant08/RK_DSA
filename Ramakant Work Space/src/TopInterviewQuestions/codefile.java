package TopInterviewQuestions;

import java.util.Arrays;

class Solution {
    public static int[][] generateMatrix(int n) {
        int[][]matrix=new int[n][n];
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;
        int count=1;
        while(count<=n*n){
            for (int i = minRow; i <= maxCol && count <= n * n; i++) {
                matrix[minRow][i]=count;
                count++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow && count <= n * n; i++) {
                matrix[i][maxCol]=count;
                count++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol && count <= n * n; i--) {
                matrix[maxRow][i]=count;
                count++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow && count <= n * n; i--) {
                matrix[i][minCol]=count;
                count++;
            }
            minCol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}