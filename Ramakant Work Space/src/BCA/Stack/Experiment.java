package BCA.Stack;

import java.util.Stack;

public class Experiment {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(4);
        stack.push(stack.pop());
        System.out.println(stack);
    }
}
