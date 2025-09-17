package BCA.DP;

public class UniquePath {
    public int uniquePaths(int n, int m) {
//        dp[i][j]=no. of way to reaj location n-1,m-1 from location i,j

        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[n - 1][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][m - 1] = 1;
        }

        for (int i = n - 2; i >= 0; i++) {
            for (int j = m - 2; j >= 0; j++) {
                int right = dp[i][j + 1];
                int down = dp[i + 1][j];
                dp[i][j] = right + down;
            }
        }

        return dp[0][0];
    }
}
