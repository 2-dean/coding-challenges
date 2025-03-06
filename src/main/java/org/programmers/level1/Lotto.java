package org.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
    private static int getRank(int count) {
        return switch (count) {
            case 6 -> 1; // 6개 일치 → 1등
            case 5 -> 2; // 5개 일치 → 2등
            case 4 -> 3; // 4개 일치 → 3등
            case 3 -> 4; // 3개 일치 → 4등
            case 2 -> 5; // 2개 일치 → 5등
            default -> 6; // 나머지 → 6등 (꽝)
        };
    }

    public static int[] solution(int[] lottos, int[] win_nums) {

/*        Map<Integer, Integer> Maxmap = new HashMap<>();
        Map<Integer, Integer> Minmap = new HashMap<>();*/
        int countMatch = 0; // 맞춘 개수
        int zeroCount = 0;  // 0의 개수

        // 당첨 번호를 Set으로 관리하여 검색 속도 최적화
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        for (int num : lottos) {
            if (num == 0){
                zeroCount++;
            } else if (winSet.contains(num)) {
                countMatch++; // 맞추면 카운트++
            }
        }

        //최고순위 0을 전부 당첨으로
        int maxRank = getRank(countMatch+zeroCount);
        //최저순위 0 을 전부 꽝으로
        int minRank = getRank(countMatch);

        return new int[]{maxRank, minRank};

    }

    public static void main(String[] args) {
        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
    }
}
