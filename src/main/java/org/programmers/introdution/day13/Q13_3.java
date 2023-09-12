package org.programmers.introdution.day13;

public class Q13_3 {

    /**
     *  문제 : 문자열 my_string이 매개변수로 주어집니다.
     *  my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     *  -공백(" ")도 하나의 문자로 구분합니다.
     *  - 대소문자 구분함
     */
    public static String solution(String my_string) {
        String answer = "";
        // String 을 구성하는 알파벳 개수를 배열에 담음
        int [] alphabet = new int[53]; // 26*2 + 공백


        for (int i = 0; i<my_string.length(); i++) {
            char currentChar = my_string.charAt(i);

            // 대소문자 구분해서 담기
            if ('A'<= currentChar && currentChar <='Z') {
                alphabet[currentChar - 'A']++;
            } else if ('a'<= currentChar && currentChar <='z') {
                alphabet[currentChar - 'a']++;
            } else if (' ' == currentChar) {
                alphabet[alphabet.length-1]++; //마지막에 추가
            }
//            System.out.println(alphabet[i]);

            // 문자열을 붙이면서 알파벳 배열에서 숫자가 2이상 이면 문자열 붙이지 않음
                // 대소문자구분
                // 알파벳 배열에 있는지 확인

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

}
