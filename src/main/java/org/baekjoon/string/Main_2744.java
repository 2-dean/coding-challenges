package org.baekjoon.string;

import java.util.Scanner;

public class Main_2744 {

/* 문제 :영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
*
*
*  */

    public static String solution(String str) {
        String result = "";
     /*   for(char c: str.toCharArray()) {
            // 대소문자구분 -> 바꾸기
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }*/
        char[] answerArr = new char[0];
        for (int i = 0; i < str.length(); i++) {
            // 대문자?
            char ch = str.charAt(i);

            // 답 담기
            String answer = "";  // 1. 더해주기
            answerArr = str.toCharArray();

            if ('A' <= ch && ch <= 'Z') {
                // 대소문자 변환
                System.out.print((char) ('a' + ch - 'A'));
                //int dist = str.charAt(i) - 'A';
                //int lower_ascii = 'a' + dist;
                answerArr[i] = (char) ('a' + ch - 'A');
            } else {
                System.out.print((char) ('A' + ch - 'a'));
                answerArr[i] = (char) ('A' + ch - 'a');
            }
        }
        System.out.println("charArr : " + answerArr);

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println(solution(inputString));
    }

}
