package BCA.Heaps;

import java.util.PriorityQueue;

public class MaxAfterKNegotiations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
            queue.add(n);
        }

        while (k > 0) {
            int element = queue.peek();
            queue.poll();
            element = -1 * element;
            queue.add(element);
        }

        int sum = 0;
        while (queue.size() > 0) {
            sum += queue.peek();
            queue.poll();
        }
        return sum;
    }
}
