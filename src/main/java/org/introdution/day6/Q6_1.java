package org.introdution.day6;

import java.util.Scanner;

public class Q6_1 {

    /**
     *  문제 :
     *  문자열 my_string이 매개변수로 주어집니다.
     *  my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int i=charArray.length-1; i >= 0;  i--) {
            answer.append(charArray[i]);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n);
    }

}
