package org.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Keyboard {
    /**
     1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과
     입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때,
     각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지
     순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
     */
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> minPress = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                System.out.println("j : " + j + " : " + keys.charAt(j));
                char c = keys.charAt(j);
                //현재 문자가 minPress에 저장되어 있으면 기존값(현재 저장된 최소횟수) 가져옴, 없으면 현재키에서 입력횟수를 기본값으로 사용
                minPress.put(c, Math.min(minPress.getOrDefault(c, j+ 1), j + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            for (char c : targets[i].toCharArray()) {
                if(!minPress.containsKey(c)) {
                    totalPress= -1; //아무것도 포함되지 않으면 -1
                    break;
                }
                totalPress += minPress.get(c);
            }
            answer[i] = totalPress;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"});
    }
}
