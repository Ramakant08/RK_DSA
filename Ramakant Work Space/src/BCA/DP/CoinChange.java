package BCA.DP;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        //dp[i][j]->fewest no. of coins required from i coins to make amount j
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for (int i = 0; i < amount; i++) {
            dp[0][i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int notPick = dp[i - 1][j];
                    int pick = 1 + dp[i][j - coins[i - 1]];
                    dp[i][j] = Math.min(pick, notPick);
                }
            }
        }

        if(dp[n][amount]==Integer.MAX_VALUE-1){
            return -1;
        }
        return dp[n][amount];
    }
}
