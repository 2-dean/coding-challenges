package org.programmers.level2;


public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;

        for (char c : s.toCharArray()) {
            answer.append(flag ? Character.toUpperCase(c) : Character.toLowerCase(c));
            flag = (c == ' '); // 공백이면 flag를 true로 설정
        }
        System.out.println(answer.toString());
        return answer.toString();

    }

    public static void main(String[] args) {
        JadenCase j = new JadenCase();
        j.solution("3people unFollowed me");
    }
}
