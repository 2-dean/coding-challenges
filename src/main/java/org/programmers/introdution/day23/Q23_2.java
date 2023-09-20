package org.programmers.introdution.day23;

import java.util.Arrays;

public class Q23_2 {

    /**
     *  문제 :등수 매기기
     *  영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] averageArr = new double[score.length];

        // 평균 점수 구하기
        for (int i=0; i< score.length; i++) {
            int eng = score[i][0];
            int math = score[i][1];
            double average = (double) (eng + math) /2;
            averageArr[i] = average;
            System.out.println("i : " + i +", average : " + average);
        }

        for (int i=0; i < averageArr.length; i++) {
            int rank = 1;
            // i 는 현재 등수를 구하고싶은 학생
            for (int j = 0; j < averageArr.length; j++){
                if(averageArr[i] < averageArr[j]) {
                     //  나보다 평균 높은 학생
                    rank++;
                }
                    System.out.println("rank : "  +rank);
            }
            answer[i] = rank;
        }



        return answer;
    }

    public static void main(String[] args) {
        int[][] score = new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println("[result] :" + Arrays.toString(solution(score)));
    }

}
