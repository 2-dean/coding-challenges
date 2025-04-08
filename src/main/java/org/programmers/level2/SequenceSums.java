package org.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class SequenceSums {
    public static int solution(int[] elements) {
        int n = elements.length;
        int[] round = new int[n * 2];
        // 원형수열 2번 이어붙임
        for (int i = 0; i < n * 2; i++) {
            round[i] = elements[i%n];
        }

        Set<Integer> set = new HashSet<>();

        for (int length = 1; length <= n; length++) { // 부분 수열의 길이
            for (int start = 0; start < n; start++) { // 수열의 시작위치
                int sum = 0;
                for (int k = 0; k < length ; k++) {
                    sum += round[start + k];
                }
                set.add(sum);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 1, 1, 4}));
    }
}
