package TopInterviewQuestions;

public class MaximumSumSubArray {
    public static int maxSum(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,2,2};
        System.out.println(maxSum(arr));
    }
}
