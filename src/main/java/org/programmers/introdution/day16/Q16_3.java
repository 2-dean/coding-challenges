package org.programmers.introdution.day16;

import java.sql.SQLOutput;

public class Q16_3 {

    /**
     *  문제 : 문자열 계산하기
     *
     *  my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
     *  수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
     */
    public static int solution(String my_string) {
        int answer = 0;

        // 문자열 나누기
        String[] strings = my_string.split(" ");

        answer += Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            // 연산자와 숫자 구분
            if(strings[i-1].equals("+")){
                answer += Integer.parseInt(strings[i]);
            }
            if (strings[i-1].equals("-")) {
                answer -= Integer.parseInt(strings[i]);
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " +  solution("3 + 4 - 2"));
    }

}
