package org.programmers.introdution.day21;

import java.util.Arrays;

public class Q21_1 {

    /**
     *  문제 :숨어있는 숫자의 덧셈 (2)
     *  문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
     *  my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(String my_string) {
        int answer = 0;

        // 문자를 공백으로 바꾸기
        String[] stringArr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (int i = 0; i < stringArr.length; i++) {
            if (!stringArr[i].equals("")) {
                answer += Integer.parseInt(stringArr[i]);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        solution("aAb1B2cC34oOp");
    }

}
