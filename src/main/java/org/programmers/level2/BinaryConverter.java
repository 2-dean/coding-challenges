package org.programmers.level2;


public class BinaryConverter {
    public static int[] solution(String s) {
        // x의 모든 0을 제거
        // x의 길이를 2진 법으로 표현한 문자열로 변환

        int delCnt = 0;
        int convertCnt = 0;

        while (!s.equals("1")) { // s가 "1"이 될 때까지 반복
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    delCnt++;
                } else {
                    sb.append(c);
                }
            }

            // 길이를 2진법으로 변환
            int length = sb.length();
            s = Integer.toBinaryString(length); // Java 내장 함수 사용

            // 3. 변환 횟수 증가
            convertCnt++;
        }
        int[] answer = {delCnt, convertCnt};
        return answer;
    }

    public static void main(String[] args) {
        solution("110010101001");
    }
}

