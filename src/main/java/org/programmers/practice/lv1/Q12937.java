package org.programmers.practice.lv1;

public class Q12937 {
    public static String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer ="Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(3));
    }

}
