package org.programmers.introdution.day14;

public class Q14_3 {

    /**
     *  문제 :암호 해독
     *  군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
     *
     * 암호화된 문자열 cipher를 주고받습니다.
     * 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
     * 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String solution(String cipher, int code) {
        String answer = "";
        char[] charArray = cipher.toCharArray();
        // code 의 배수면 Index 는 code-1 번 부터 시작~!
        for (int i = code; i <= charArray.length;) {
            answer += charArray[i-1];
            i += code;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution("dfjardstddetckdaccccdegk", 4));
    }

}
