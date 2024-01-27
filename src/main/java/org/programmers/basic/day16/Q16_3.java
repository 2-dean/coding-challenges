package org.programmers.basic.day16;

public class Q16_3 {

    /**
     *  문제 :배열에서 문자열 대소문자 변환하기
     */
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        // 홀수번째 인덱스는 대문자 짝수번째 인덱스는 소문자로
        for (int i=0; i< strArr.length; i++) {
            if(i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AAA", "BBB", "CCC", "DDD"}));
    }

}
