package org.programmers.practice.lv1;

public class Q12912 {

    /**
     *  문제 :두 정수 사이의 합
     *
     *  두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
     * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
     *
     */
    public static long solution(int a, int b) {
        long answer = 0;

        int start = 0;
        int end = 0;

        if (a != b) {
            if (a > b) {
                start = b;
                end = a;
            }
            if (b > a) {
                start = a;
                end = b;
            }

            for (int i = start; i <= end ; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3, 5);
    }

}
