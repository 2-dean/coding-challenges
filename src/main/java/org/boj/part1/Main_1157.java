package org.boj.part1;

import java.util.HashMap;
import java.util.Map;

public class Main_1157 {
    /*
    * 문제 : 단어 공부
     * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
    *  단, 대문자와 소문자를 구분하지 않는다.
     * */
    public static String solution(String str) {
        String answer = "";
        String upperCase = str.toUpperCase();
        int max = 0;
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (char c : upperCase.toCharArray()) {
            // 맵에 넣고, VALUE값을 비교
            System.out.println("c :"  +c);
            map.put(String.valueOf(c), map.getOrDefault(c, 0)+1);
            System.out.println("c :"  +map.get(c));
        }
        System.out.println(map.toString());

        // value가 큰값 return
        for (String s : map.keySet()) {
            if(map.get(s) >= max) {
                if (max == map.get(s)) {
                    count++;
                }
                max = map.get(s);
                answer = s;
            }
        }
        // valuer가 큰 값이 2개이상이면 ? 리턴
        if (count >= 2) {
            answer = "?";
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("baaa"));
    }
}
