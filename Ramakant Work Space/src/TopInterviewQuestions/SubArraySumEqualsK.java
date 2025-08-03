package TopInterviewQuestions;

public class SubArraySumEqualsK {
    public static int subArraySum(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (sum == k) {
                    count++;
                    sum = 0;
                    break;
                } else if (sum > k) {
                    sum = 0;
                    break;
                } else {
                    sum += arr[j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 5, 8, 5, 3};
        int k = 8;
        System.out.println(subArraySum(arr, k));
    }
}
