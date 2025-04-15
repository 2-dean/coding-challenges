package org.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {
    public static int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5}; //len 5
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5}; //len8
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //len10

        int[] score = {0, 0 , 0};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i% student1.length]) {
                score[0]++;
            }
            if (answers[i] == student2[i% student2.length]) {
                score[1]++;
            }
            if (answers[i] == student3[i% student3.length]) {
                score[2]++;
            }
        }
        List<Integer> result = new ArrayList<>();
        // 최대 점수구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                result.add(i+1);
            }
        }

        // 배열로 변환해서 리턴
        return result.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
    }
}
