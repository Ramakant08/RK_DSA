package BCA.Heaps;

import javax.imageio.metadata.IIOMetadataNode;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
        int n=nums.length;
        int i=0;
        for (;i<k;i++){
            priorityQueue.add(nums[i]);
        }

        for (;i<n;i++){
            if(priorityQueue.peek()<nums[i]){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
        }
        return priorityQueue.peek();
    }
}
