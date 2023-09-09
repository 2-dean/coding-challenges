package org.programmers.introdution.day12;

public class Q12_1 {

    /**
     *  문제 :
     *  영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
     *  문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static  String solution(String my_string) {
        StringBuilder answer = new StringBuilder();


        // 문자열이 포함되면? 담지 않기

        for (char c : my_string.toCharArray()) {
            if (c != 'a' && c != 'i' && c != 'o' && c != 'u' && c != 'e') {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String result = solution("bus");
        System.out.println(result);
    }

}
