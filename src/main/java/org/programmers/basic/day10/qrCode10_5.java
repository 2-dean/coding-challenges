package org.programmers.basic.day10;

import java.util.ArrayList;
import java.util.List;

public class qrCode10_5 {
    static String solution(String code, int q, int r) {
        // q, r과 문자열 code가 주어질 때,
        // code의 각 인덱스를 q로 나누었을 때
        // 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return
        String answer = "";
        char[] arr = code.toCharArray();
        List<StringBuilder> list = new ArrayList<>(); // StringBuilder를 사용하여 문자열 연결 효율성 개선
        StringBuilder rowStr = new StringBuilder(); // StringBuilder를 사용하여 문자열 연결 효율성 개선

        for (int i=0; i< arr.length; i++) {
            if (i % q == r) {
                rowStr.append(arr[i]);
            }
        }
        answer = rowStr.toString();
        return answer;
    }


    public static void main(String[] args) {
        String code = "qjnwezgrpirldywt";

        String result = solution(code, 3, 1);
        System.out.println(" [ result ] : " + result);
    }

}
