package org.programmers.practice.lv1;

import java.sql.SQLOutput;

public class Q12934 {

    /**
     *  문제 :정수 제곱근 판별
     *
     */
    public static long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);

        System.out.println(sqrt);
        if (n ==  (long) Math.pow(sqrt, 2)) {
            answer = (long) Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3);
    }

}
