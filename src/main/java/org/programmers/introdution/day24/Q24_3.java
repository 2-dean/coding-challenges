package org.programmers.introdution.day24;

import java.util.Arrays;

public class Q24_3 {

    /**
     *  문제 :A로 B 만들기
     *
     *
     *  문자열 before와 after가 매개변수로 주어질 때,
     *  before의 순서를 바꾸어 after를 만들 수 있으면 1을,
     *  만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(String before, String after) {
        int answer = 0;

        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        // before의 알파벳 구성과 after의 알파벳 구성이 같아야함
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for (int i = 0; i < before.length(); i++) {
            if (beforeArr[i] == afterArr[i]) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + solution("abcddf","fedcba"));
    }

}
