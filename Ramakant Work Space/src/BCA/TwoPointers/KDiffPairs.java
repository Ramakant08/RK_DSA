package BCA.TwoPointers;

import java.util.Arrays;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int counter = 0;
        while (i < nums.length && j < nums.length) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                counter++;
                i++;
                j++;
                while (j < nums.length && nums[j - 1] == nums[j]) {
                    j++;
                }
            }
        }
        return counter;
    }





    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{1,1,1},2));
    }
}
