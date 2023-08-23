package org.programmers.basic.day10;

import java.util.ArrayList;
import java.util.List;

public class StringColumnExtractor10_4 {
    static String solution(String my_string, int m, int c) {
        // m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return
        String answer = "";
        char[] arr = my_string.toCharArray();
        List<StringBuilder> list = new ArrayList<>(); // StringBuilder를 사용하여 문자열 연결 효율성 개선
        StringBuilder rowStr = new StringBuilder(); // StringBuilder를 사용하여 문자열 연결 효율성 개선

        int rowNum = (int) Math.ceil((double) arr.length / m); // 총 행의 개수 계산


        for (int i = 0; i < arr.length; i++) {
            rowStr.append(arr[i]); // 현재 글자를 현재 행에 추가

            // 다음 열로 넘어갈 때 또는 마지막 글자인 경우
            if ((i + 1) % m == 0 || i == arr.length - 1) {
                list.add(new StringBuilder(rowStr.toString())); // 현재 행을 리스트에 추가 (문자열로 변환하여 추가)
                rowStr = new StringBuilder(); // 다음 행을 위해 StringBuilder 초기화
            }
        }

        // 세로로 c번째 열의 글자들을 문자열로 연결
        for (StringBuilder sb : list) {
            if (sb.length() >= c) {
                answer += sb.charAt(c - 1);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";

        String result = solution(my_string, 4, 2);
        System.out.println(" [ result ] : " + result);
    }

}
