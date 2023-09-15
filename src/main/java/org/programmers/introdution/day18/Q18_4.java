package org.programmers.introdution.day18;

import java.util.Arrays;

public class Q18_4 {

    /**
     *  문제 :
     *  영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
     *  my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static String solution(String my_string) {
        String answer = "";

        // 모두 소문자로 바꿈
        String lowerCase = my_string.toLowerCase();
        // 알파벳 순서대로 정렬
        char[] charArray = lowerCase.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++) {
            answer+=charArray[i];
        }


        return answer;
    }

    public static void main(String[] args) {

    }

}
