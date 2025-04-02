package org.programmers.level2;

import java.util.Stack;

public class RemovePair {
    public static int solution(String s) {


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.get(stack.size() - 1) == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        solution("baabaa");
        solution("cdcd");
    }
}
