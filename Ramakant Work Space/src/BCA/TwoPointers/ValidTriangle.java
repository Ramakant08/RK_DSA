package BCA.TwoPointers;


import java.util.Arrays;

public  class ValidTriangle {
    public static int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            int left=0; int right=i-1;
            while(left<right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{4,2,3,4}));
    }
}
