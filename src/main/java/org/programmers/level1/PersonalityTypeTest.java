package org.programmers.level1;

import java.util.*;

public class PersonalityTypeTest {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        //질문 에서 유형-점수 계산하기 map?
        //1~3 : 앞쪽 3,2,1
        // 4: 0
        //5~7: 뒷쪽 1,2,3

        // 7,1 = 3
        // 6,2 = 2
        // 5,3 = 1
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int point = 0;
            char type;

            if (choices[i] < 4) {
                // 비동의 ++
                type = survey[i].charAt(0);
                if (choices[i] == 1) point = 3;
                if (choices[i] == 2) point = 2;
                if (choices[i] == 3) point = 1;
                map.put(type, map.getOrDefault(type, 0) + point);
            }
            if (choices[i] > 4) {
                // 앞쪽++
                type = survey[i].charAt(1);
                if (choices[i] == 7) point = 3;
                if (choices[i] == 6) point = 2;
                if (choices[i] == 5) point = 1;
                map.put(type, map.getOrDefault(type, 0) + point);
            }
        }

        StringBuilder sb = new StringBuilder();

        // 문제에서 주어진 성격유형
        char[][] indicators = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        for (char[] pair : indicators) {
            char type1 = pair[0]; // 앞
            char type2 = pair[1]; // 뒤

            int score1 = map.getOrDefault(type1, 0);
            int score2 = map.getOrDefault(type2, 0);

            sb.append(score1 >= score2 ? type1 : type2); // 점수가 같으면 사전순으로 빠른 것 선택
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        solution(survey, choices);
    }
}
