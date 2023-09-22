package org.programmers.practice.lv1;

public class Q12948 {

    /**
     *  문제 :핸드폰 번호 가리기
     *  프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
     *  전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
     *
     */
    public static String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();

        String number  = phone_number.substring(length-4,length);
        for (int i = 0; i< length-4; i++) {
            answer += "*";
        }
        answer = answer + number;
        return answer;
    }

    public static void main(String[] args) {
        solution("01033334444");
    }

}
