package org.baekjoon.string;

import java.util.Scanner;

public class Main_2744 {

/* 문제 :영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
*
*
*  */

    public static String solution(String str) {
        String result = "";
        for(char c: str.toCharArray()) {
            // 대소문자구분 -> 바꾸기
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println(solution(inputString));
    }

}
