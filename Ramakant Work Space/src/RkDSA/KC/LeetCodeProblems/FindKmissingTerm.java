package RkDSA.KC.LeetCodeProblems;

public class FindKmissingTerm {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
//        int[] arr = {1, 2, 3, 4};
//        int[] arr = {3,10};
//        int[] arr = {1};
        System.out.println(findKthPositive(arr, 7));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int missing = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            missing = arr[mid] - (mid + 1);
            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
         return end+1+k;
    }
}
