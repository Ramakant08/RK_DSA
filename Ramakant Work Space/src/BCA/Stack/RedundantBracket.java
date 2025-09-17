package BCA.Stack;

import java.util.Stack;

public class RedundantBracket {
    public static void main(String[] args) {
        String string="(a+b)+c";
        Stack<Character>stack=new Stack<>();
        boolean redundantFlag=true;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)!=')'){
                stack.push(string.charAt(i));
            }else {
                do {
                    if(stack.peek()=='+'||stack.peek()=='-'||stack.peek()=='*'||stack.peek()=='/'){
                        redundantFlag=false;
                    }
                }while (!stack.isEmpty()&&stack.pop()!='(');
                if(redundantFlag){
                    System.out.println("true");
                }
            }
        }
        System.out.println(redundantFlag);
    }
}

