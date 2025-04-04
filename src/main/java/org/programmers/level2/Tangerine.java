package org.programmers.level2;

import java.util.*;

public class Tangerine {

    public static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        // 1. 귤 크기별 개수 세기
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // 갯수별로 내림차순 정렬
        List<Integer> count = new ArrayList<>(map.values());
        System.out.println(count);
        count.sort(Collections.reverseOrder());

        int total = 0,variety = 0;

        for (int size : count) {
            total += size;
            variety++;
            if (total >= k) return variety;
        }
        return variety;
    }

    public static void main(String[] args) {
        solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
    }
}
