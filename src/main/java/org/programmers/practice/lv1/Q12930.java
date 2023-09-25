package org.programmers.practice.lv1;

public class Q12930 {

    /**
     *  문제 :이상한 문자 만들기
     *  문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
     *  각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
     *
     * 제한 사항
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
     *
     *
     * TC 4,5,8,9,11
     */
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        // 공백을 기준으로 나누기
        // 단어별 짝/홀수 번째 문자를 각각 대/소문자로 바꿈

        String[] strings = s.split(" ", -1); //와 같이 호출하면 마지막에 오는 빈 문자열도 포함합니다.

        for (int i = 0; i < strings.length; i++) {
            // 단어별
            char[] wordArr = strings[i].toCharArray();
            for (int k = 0; k < wordArr.length; k++) {
                if (k % 2 == 0){
                    // 짝수일때 대문자
                    wordArr[k] = Character.toUpperCase(wordArr[k]);
                } else{
                    // 홀수일때 소문자
                    wordArr[k] = Character.toLowerCase(wordArr[k]);
                }
            }
            if (i >= 1){
                answer.append(" ");
            }
            answer.append(wordArr); // char[] 배열을 그대로 추가
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("  try hello world "));
    }

}
