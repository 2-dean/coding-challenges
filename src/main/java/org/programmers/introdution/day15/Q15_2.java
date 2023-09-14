package org.programmers.introdution.day15;

import java.util.Arrays;

public class Q15_2 {

    /**
     *  문제 : 인덱스 바꾸기
     *  문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
     *  my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] charArray = my_string.toCharArray();
        // 문자열을 저장
       char charNum1 = my_string.charAt(num1);
       char charNum2 = my_string.charAt(num2);


        for (int i = 0; i < my_string.length(); i++){
            if (i == num1) {
                charArray[i] = charNum2;
            }
            if (i == num2) {
                charArray[i] = charNum1;
            }
        }

        for (int i = 0; i< charArray.length; i++) {
            answer += charArray[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution("I love you", 3,6));
    }

}
