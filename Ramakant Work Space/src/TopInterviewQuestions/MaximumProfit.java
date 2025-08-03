package TopInterviewQuestions;

public class MaximumProfit {
    public static int getMaxProfit(int[] arr) {
        int profit = 0;
        int buyPrice = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < buyPrice) {
                buyPrice = arr[i];
            }
            int currentProfit = Math.abs(arr[i] - buyPrice);
            profit = Math.max(profit, currentProfit);                      //kedaens ALogrithm
        }
        return profit;
    }
}
