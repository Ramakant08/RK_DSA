package BCA.Stack;

import java.util.Stack;

class MinStack {

    Stack<MinStack> stack = new Stack<>();
    int currentElement;
    int minimumElement = Integer.MAX_VALUE;

    public MinStack() {
    }

    @Override
    public String toString() {
        return "MinStack{" +
                "stack= " + stack +
                '}';
    }

    public void push(int val) {
        MinStack minStack = new MinStack();
        minStack.currentElement = val;
        if (stack.isEmpty()) {
            minStack.minimumElement = Math.min(val, this.minimumElement);
            stack.push(minStack);
        } else {
            minStack.minimumElement = Math.min(val, stack.peek().minimumElement);
            stack.push(minStack);
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().currentElement;
    }

    public int getMin() {
        return stack.peek().minimumElement;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(3);
        minStack.push(4);
        minStack.push(5);
        minStack.push(6);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.top());
    }
}
