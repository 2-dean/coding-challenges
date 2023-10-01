package org.programmers.practice.lv1;

public class Q12926 {

    /**
     *  문제 :시저 암호
     *  어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     *  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
     *  문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
     */
    public static String solution(String s, int n) {

        // 문장에서 순서대로 대, 소문자 구분해서 밀어서 바꾼문자 로 변환
        // z, Z일 경우 a부터 돌아감
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }

            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z" , 4));
    }

}
