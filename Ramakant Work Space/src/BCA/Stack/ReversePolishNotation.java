package BCA.Stack;

import java.util.Objects;
import java.util.Stack;
//approach-> push element into stack if it is an integer and if it is an operator then pop two elements and do the operation and push back in stack
public class ReversePolishNotation {
    static int solve(String[]  input){
        Stack<Integer> stack=new Stack<>();

        for(String ch:input){
            if(!Objects.equals(ch, "+") && !Objects.equals(ch, "-") && !Objects.equals(ch, "*") && !Objects.equals(ch, "/")){
                stack.push(Integer.parseInt(ch));
            }else{
                int el1=stack.pop();
                int el2=stack.pop();
                int op=0;
                if(ch.equals("+")){
                    op=el1+el2;
                }else if(ch.equals("-")){
                    op=el2-el1;
                }else if(ch.equals("*")){
                    op=el1*el2;
                }else{
                    op=el2/el1;
                }
                stack.push(op);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(solve(new String[]{"4","13","5","/","+"}));
    }
}
