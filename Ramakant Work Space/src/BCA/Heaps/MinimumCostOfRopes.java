package BCA.Heaps;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int cost = calculateCost(arr);
        System.out.println(cost);
    }

    private static int calculateCost(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int cost = 0;
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }

        while (priorityQueue.size() > 1) {
            int first = priorityQueue.peek();
            priorityQueue.poll();
            int second = priorityQueue.peek();
            priorityQueue.poll();
            int costCurr = first + second;
            cost += costCurr;
            priorityQueue.add(costCurr);
        }

        return cost;
    }
}
