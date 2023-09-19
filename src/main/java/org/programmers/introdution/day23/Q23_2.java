package org.programmers.introdution.day23;

import java.util.Arrays;

public class Q23_2 {

    /**
     *  문제 :등수 매기기
     *  영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];


        // 평균 점수 구하기
        for (int i=0; i< score.length; i++) {
            int eng = score[i][0];
            int math = score[i][1];

            int average = (eng + math)/2;
            answer[i] = average;
            System.out.println("i : " + i +", average : " + average);
        }

        //Arrays.sort(answer);

        for (int i=0; i < answer.length; i++) {
            answer[i] = i  + 1;
        }



        return answer;
    }

    public static void main(String[] args) {

    }

}
