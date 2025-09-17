package BCA.DP;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
//        dp[i][j]->Number of ways to make j amount with i coins
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= amount; i++) {
            dp[0][i] = 0;
        }

        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    int pick = dp[i][j - coins[i - 1]]; //way in case we pick the coin
                    int notPick = dp[i - 1][j]; //way in case we dont pick the coin
                    dp[i][j] = pick + notPick;
                } else {
                    int notPick = dp[i - 1][j];
                    dp[i][j] = notPick;
                }
            }
        }
        return dp[n][amount];
    }
}
