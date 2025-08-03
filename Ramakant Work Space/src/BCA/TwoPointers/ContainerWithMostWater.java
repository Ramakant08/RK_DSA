package BCA.TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = height.length - 1;
        int left = 0;

        while (left < right) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;
            int area = length * width;
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }


}
