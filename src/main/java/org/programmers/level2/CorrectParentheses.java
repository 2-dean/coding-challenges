package org.programmers.level2;

import java.util.Stack;
public class CorrectParentheses {

    static boolean solution(String s) {
        boolean answer = true;
        /*
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')')) {
                return false;
            }
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            }
        }
        answer = stack.isEmpty();
         */
        // O(1)	불필요한 연산 없이 더 빠름
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
                if (count > 0) return false;
            }
        }
        return count == 0;
        //return answer;
    }

    public static void main(String[] args) {

        solution("())((()))(()");
    }
}
