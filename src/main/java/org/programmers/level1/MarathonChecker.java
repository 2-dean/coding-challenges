package org.programmers.level1;

import java.util.*;

// 레벨1 다시풀기, 완주하지못한 선물
public class MarathonChecker {
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        //String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                //result = entry.getKey();
                return entry.getKey();
            };
        }
        return ""; //기본값

    }

    public static void main(String[] args) {
        solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}
                , new String[]{"josipa", "filipa", "marina", "nikola"});
    }
}
