package org.programmers.introdution.day7;

public class Q7_1 {

    /**
     *  문제 :
     *  문자열 my_string과 문자 letter이 매개변수로 주어집니다.
     *  my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String solution(String my_string, String letter) {
        String answer = "";

        for (char str : my_string.toCharArray()) {
            if (str != letter.charAt(0)) {
                answer+= str;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string= "abcdef";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }

}
