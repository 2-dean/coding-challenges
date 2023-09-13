package org.programmers.introdution.day13;

import java.util.Arrays;

public class Q13_3 {

    /**
     *  문제 : 문자열 my_string이 매개변수로 주어집니다.
     *  my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     *  -공백(" ")도 하나의 문자로 구분합니다.
     *  - 대소문자 구분함
            // A 65, Z 90
            // a 97, z 112
     */
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        // String 을 구성하는 알파벳 개수를 배열에 담음
        int [] alphabet = new int[53]; // 26*2 + 공백

        for (int i = 0; i<my_string.length(); i++) {
            char currentChar = my_string.charAt(i);

            // 대소문자 구분해서 담기
            if ('A'<= currentChar && currentChar <='Z') {
                System.out.println("current char : " + currentChar);
                if(alphabet[currentChar - 'A'] == 0) {
                    System.out.println("current char 담음 : " + currentChar);
                    alphabet[currentChar - 'A']++;
                }
            } else if ('a'<= currentChar && currentChar <='z') {
                System.out.println("current char : " + currentChar);
                System.out.println("current char-'a' : " + (currentChar - 'a'));
                if(alphabet[currentChar - 'a' + 26] == 0) {
                    System.out.println("current char 담음 : " + currentChar);
                    alphabet[currentChar - 'a' + 26]++;
                }
            } else if (' ' == currentChar) {
                if(alphabet[alphabet.length-1] == 0) {
                    alphabet[alphabet.length-1]++; //마지막에 추가
                }
            }

        }
        System.out.println("alphabet "+ Arrays.toString(alphabet));

        for (int i= 0; i<my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            // 문자열을 붙이면서 알파벳 배열에서 숫자가 2이상 이면 문자열 붙이지 않음
            // 대소문자, 공백 구분
            // 알파벳 배열에 있는지 확인
            // 배열의 값이 2이상인지 확인
            if ('A' <= currentChar && currentChar <= 'Z') {
                if(alphabet[currentChar - 'A'] == 1) {
                    answer.append(currentChar);
                    alphabet[currentChar - 'A']--;
                }
            } else if ('a' <= currentChar && currentChar <= 'z') {
                if(alphabet[currentChar - 'a' + 26] == 1) {
                    answer.append(currentChar);
                    alphabet[currentChar - 'a' + 26]--;
                }
            } else  {
                if((alphabet[alphabet.length -1]) == 1) {
                    answer.append(' ');
                    alphabet[alphabet.length -1]--;
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

}
