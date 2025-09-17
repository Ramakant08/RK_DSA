package BCA.DP;

public class MinimumCostToReachDestination {
    public int minPathSum(int[][] grid) {
        //     dp[i][j]-> minimum cost to reach n-1,m-1 from i,j
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[n - 1][m - 1] = grid[n - 1][m - 1];
        for (int i = m - 2; i >= 0; i--) {
            dp[n - 1][i] = grid[n - 1][i] + dp[n - 1][i + 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            dp[i][m - 1] = grid[i][m - 1] + dp[i + 1][m - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                int right = grid[i][j] + dp[i][j + 1];
                int down = grid[i][j] + dp[i + 1][j];
                dp[i][j] = Math.min(right, down);
            }
        }
        return dp[0][0];
    }
}
