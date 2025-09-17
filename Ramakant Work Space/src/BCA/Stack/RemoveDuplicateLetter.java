package BCA.Stack;

import java.util.*;
//abcdca
//abcd

//Approach-> Keep one monotonic stack(increasing stack, one  map(for frequency of element), and visited array )
//purpose-> Stack to keep element smallest in lexicographical order
// map-> mark the frequency of element
//array=> to check if the element is visited or not.
//logic-> add the lelemt in stack keeping the increasing order and add only if it has not been visited
//and in case upcomin element is small remove the element from stack only if it's frequency is not zero in map
public class RemoveDuplicateLetter {
    static String check(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        for (char ch : s.toCharArray()) {
            map.put(ch, map.get(ch) - 1);
            if (!visited[ch - 'a']) {
                while (!stack.isEmpty() && stack.peek() > ch && map.get(stack.peek()) > 0) {
                    char removed = stack.pop();
                    visited[removed - 'a'] = false;
                }
                stack.push(ch);
                visited[ch - 'a'] = true;
            }
        }

        String str="";
       while (!stack.isEmpty()){
            str=stack.pop()+str;
       }
       return  str;


    }

    public static void main(String[] args) {
        String string = "cbacdcbc";
        System.out.println(check(string));
    }
}
