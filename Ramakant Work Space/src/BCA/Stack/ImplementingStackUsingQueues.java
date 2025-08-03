package BCA.Stack;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementingStackUsingQueues {

    Queue<Integer> queue = new ArrayDeque<>();

    public ImplementingStackUsingQueues() {

    }

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            int num = queue.poll();
            queue.add(num);
        }
    }

    public int pop() {
        int num = 0;
        if (!queue.isEmpty()) {
            num = queue.peek();
            queue.poll();
        }
        return num;

    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
       return queue.isEmpty();
    }
}
