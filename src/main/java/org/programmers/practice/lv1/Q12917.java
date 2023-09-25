package org.programmers.practice.lv1;

import java.util.Arrays;

public class Q12917 {

    /**
     *  문제 :문자열 내림차순으로 배치하기
     *
     *  문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
     *  s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     */
    public static String solution(String s) {

        char[] upper = new char[26];
        char[] lower = new char[26];

        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if ('A' <= c && c <= 'Z') {
                upper[c - 'A']++;
            } else {
                lower[c - 'a']++;
            }
        }
//        System.out.println("lower :" + Arrays.toString(lower));
//        System.out.println("upper :" + Arrays.toString(upper));

        StringBuilder answerBuilder = new StringBuilder();

        // 소문자, 대문자 역순으로 붙이기
        for (int i = 25; i >= 0; i--) {
            while (lower[i] > 0) {
                answerBuilder.append((char) ('a' + i));
                lower[i]--;
            }
        }
        for (int i = 25; i >= 0; i--) {
            while (upper[i] > 0) {
                answerBuilder.append((char) ('A' + i));
                upper[i]--;
            }
        }

        return answerBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

}
