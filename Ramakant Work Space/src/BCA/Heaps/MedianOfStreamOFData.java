package BCA.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStreamOFData {
    PriorityQueue<Integer>high=new PriorityQueue<>();
    PriorityQueue<Integer>low=new PriorityQueue<>(Collections.reverseOrder());

    MedianOfStreamOFData(){

    }

    public void addNum(int num){
        low.add(num);
        high.add(low.peek());
        low.poll();
        if(low.size()<high.size()){
            low.add(high.peek());
            high.poll();
        }
    }

    public double findMedian(){
        if(low.size()==high.size()){
            return (low.peek()+high.peek())/2.0;
        }else{
            return low.peek();
        }
    }
}
