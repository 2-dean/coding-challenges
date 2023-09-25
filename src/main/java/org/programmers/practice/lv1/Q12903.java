package org.programmers.practice.lv1;

public class Q12903 {

    /**
     *  문제 :가운데 글자 가져오기
     *
     *
     *  단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
     *  단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
     */
    public static String solution(String s) {
        String answer = "";

        // 길이 홀짝 구분
        // 홀 - length/2
        // 짝 - length/2, length/2-1 인덱스 리턴

        if (s.length() % 2 == 0) {
            answer+= Character.toString(s.charAt(s.length()/2 -1));
            answer+= Character.toString(s.charAt(s.length()/2));
        } else {
            answer = Character.toString(s.charAt(s.length()/2));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }

}
