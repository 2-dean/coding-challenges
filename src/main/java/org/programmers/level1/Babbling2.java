package org.programmers.level1;

public class Babbling2 {
    /**
     * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
     * 조카는 아직 "aya", "ye", "woo", "ma"
     * 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고
     * 연속해서 같은 발음을 하는 것을 어려워합니다.
     * 문자열 배열 babbling이 매개변수로 주어질 때,
     * 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
     *
     * 1 ≤ babbling의 길이 ≤ 100
     * 1 ≤ babbling[i]의 길이 ≤ 30
     * 문자열은 알파벳 소문자로만 이루어져 있습니다.
     * @param babbling
     * @return
     */
    public static int solution(String[] babbling) {
        int answer = 0;

        // 발음할 수 있는 말
        String[] able = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;

            for (String a : able) {
                // 연속된 발음불가 -> 연속된 발음 체크
                if(temp.contains(a + a)) {
                    temp = word; // 원본유지
                    break;
                }
                temp = temp.replace(a, " ");
            }

            // 공백 제거 후 빈 문자열이면 유효한 단어로 카운트
            if(temp.replace(" ", "").isEmpty()) {
                answer++;
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        //"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"
        solution(new String[]{"aya", "yee", "u", "maa"});
    }
}
