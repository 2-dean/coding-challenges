package org.programmers.practice.lv1;

import java.util.HashMap;
import java.util.Map;

public class Q142086 {

    /**
     *  문제 :가장 가까운 같은 글자
     */
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map1 = new HashMap<>(); // 문자와 해당 문자의 최근 위치를 저장하는 맵
        Map<Character, Integer> map2 = new HashMap<>(); // 문자와 가장 가까운 동일 문자와의 거리를 저장하는 맵

        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i); // 문자가 처음 나왔을 때, 해당 문자와 위치(i)를 map1에 저장
                map2.put(s.charAt(i), -1); // 처음 나왔으므로 가장 가까운 위치를 -1로 초기화

                answer[i] = -1; // 문자가 처음 나왔으므로 해당 위치에 -1을 저장
            } else {
                // 이미 나왔던 문자인 경우
                map2.put(s.charAt(i), i - map1.get(s.charAt(i))); // 현재 위치와 최근 위치 간의 거리 계산하여 map2에 저장
                map1.put(s.charAt(i), i); // 최근 위치를 업데이트
                answer[i] = map2.get(s.charAt(i)); // 해당 위치에 거리를 저장
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }

}
