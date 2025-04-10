package org.programmers.level2;

import java.util.ArrayList;
import java.util.Stack;

public class ToRotateParentheses {

    public static int solution(String s) {
        // 원형배열 보다는 스택을 써야함
        // 전체 회전

        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) {
                count++;
            }
        }


        return count;
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(' ||
                        c == ']' && top != '[' ||
                        c == '}' && top != '{')   {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // 모두 짝이 맞아야 함
    }

    public static void main(String[] args) {
        solution("[](){}");
    }
}