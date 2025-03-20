package org.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Race {
    /*
    해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다.
     */
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        int index = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String player : players) {
            map.put(player, index++); // 배열과 같은 인덱스로 저장
        }

        for(String calling : callings) {
            int calledIndex = map.get(calling).intValue();
            int targetIndex = calledIndex - 1; // 앞 인덱스와 바꿈

            String targetPlayer = players[targetIndex];  // 앞사람
            players[calledIndex] = players[targetIndex]; // 현재 자리에 앞사람 이름 넣음
            players[targetIndex] = calling; // 앞자리에 이름불린사람 넣음

            map.put(calling, targetIndex);
            map.put(targetPlayer, calledIndex);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
    }
}
