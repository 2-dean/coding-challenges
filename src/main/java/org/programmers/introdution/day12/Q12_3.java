package org.programmers.introdution.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q12_3 {

    /**
     *  문제 :
     * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(String my_string) {
        int answer = 0;


        for (char c : my_string.toCharArray()) {
            // 숫자, 문자 확인
            if (Character.isDigit(c)) {
                int number = Character.getNumericValue(c);
                // 숫자만 더함
                answer += number;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = solution("aAb1B2cC34oOp");
        System.out.println(result);
    }

}
