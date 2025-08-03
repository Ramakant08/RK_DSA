package TopInterviewQuestions;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int a = mat.length;
        for(int i=0; i<a; i++){
            sum = sum + mat[i][i]+mat[i][a-1-i];
            if(i+i== a-1){
                sum = sum - mat[i][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }
}
