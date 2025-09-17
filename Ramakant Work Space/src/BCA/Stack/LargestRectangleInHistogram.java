package BCA.Stack;

import java.util.Arrays;
import java.util.Stack;


public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int[] leftSmaller = new int[heights.length];
        int[] rightSmaller = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftSmaller[i] = -1;
                stack.push(i);
            } else {
                leftSmaller[i] = stack.peek();
                stack.push(i);
            }
        }
        System.out.println(Arrays.toString(leftSmaller));
        Stack<Integer> stack1 = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                rightSmaller[i] = heights.length;
                stack1.push(i);
            } else {
                rightSmaller[i] = stack1.peek();
                stack1.push(i);
            }
        }

        int maxArea = -11;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, (rightSmaller[i] - leftSmaller[i] - 1) * heights[i]);
        }
        System.out.println(Arrays.toString(rightSmaller));
        return maxArea;
    }

    static int[] temperatures(int[]  input){
        Stack<Integer>stack=new Stack<>();
        int []arr=new int[input.length];
        for(int i=0;i<input.length;i++){
            while(!stack.isEmpty()&&input[i]>=input[stack.peek()]){
                int index=stack.pop();
                arr[index]=i-index;
            }
            stack.push(i);
        }
        return arr;
    }

    static int[] temperaturesI(int[]  input){
        Stack<Integer>stack=new Stack<>();
        int []arr=new int[input.length];
        for(int i=0;i<input.length;i++){
            while(!stack.isEmpty()&&input[i]>=input[stack.peek()]){
                int index=stack.pop();
                arr[index]=i-index;
            }
            stack.push(i);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
//        int area = largestRectangleArea(arr);
//        System.out.println(area);
        System.out.println(Arrays.toString(temperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}
