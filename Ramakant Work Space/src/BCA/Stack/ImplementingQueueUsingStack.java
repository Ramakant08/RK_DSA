package BCA.Stack;

import java.util.Stack;

public class ImplementingQueueUsingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
            return output.pop();
        }
        return output.pop();
    }

    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
            int num = output.peek();
            return num;
        }
        int num = output.peek();
        return num;
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }
}
