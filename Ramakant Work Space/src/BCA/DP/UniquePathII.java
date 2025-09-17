package BCA.DP;

public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        dp[i][j]-> no. of ways to reach n-1,m-1 from location i,j considering there are obstacle in way

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        boolean rowHasLian = false;
        boolean colHasLion = false;
        for (int i = m - 1; i >= 0; i--) {
            if (obstacleGrid[n - 1][i] == 0 && rowHasLian == false) {
                dp[n - 1][i] = 1;
            } else {
                rowHasLian = true;
                dp[i][n - 1] = -1;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (obstacleGrid[i][m - 1] == 0 && colHasLion == false) {
                dp[i][m - 1] = 1;
            } else {
                colHasLion = true;
                dp[i][m - 1] = -1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 0) {
                int right=0;
                if(obstacleGrid[i][j+1]!=1&&dp[i][j+1]!=-1){
                    right=dp[i][j+1];
                }
                int down=0;
                if(obstacleGrid[i+1][j]!=1&&dp[i+1][j]!=-1){
                    down=dp[i+1][j];
                }
                    dp[i][j] = right+down;
                }
            }
        }
        return dp[0][0];
    }
}
