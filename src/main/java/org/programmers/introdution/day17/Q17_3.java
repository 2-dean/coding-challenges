package org.programmers.introdution.day17;

public class Q17_3 {

    /**
     *  문제 : 자릿수 더하기
     *  정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return 하도록 solution 함수를 완성해주세요
     */
    public static int solution(int n) {
        int answer = 0;
        // int 를 자릿수별 int[]로 분할
        String string = Integer.toString(n);
        for (int i = 0; i < string.length(); i++) {
            int num = string.charAt(i) - '0';
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

}
