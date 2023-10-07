package org.programmers.practice.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q68644 {

    /**
     *  문제 :두 개 뽑아서 더하기
     */
    public static int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>(); // 중복된 합을 방지하기 위한 Set

        for (int i = 0; i < numbers.length; i++ ){
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum); // 중복된 합을 방지하기 위해 Set에 추가
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;

        for (int num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[] {2,1,3,4,1});
    }

}
