package org.programmers.introdution.day24;

import java.util.Arrays;

public class Q24_2 {

    /**
     *  문제 :이진수 더하기
     *
     *  이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public static String solution(String bin1, String bin2) {
        String answer = "";

        //  Integer 클래스의 toBinaryString 함수를 사용하여 진수를 변환한다!

        // 2진수의 문자열을 10진수로변환
        int intBin1 = Integer.parseInt(bin1, 2);
        int intBin2 = Integer.parseInt(bin2, 2);

        int sum = intBin1 + intBin2;

        // 10진수를 2진수로 변환
        answer= Integer.toBinaryString(sum);

        return answer;


    }

    public static void main(String[] args) {
        solution("10", "11");
    }

}
