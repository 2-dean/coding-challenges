package org.programmers.introdution.day23;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q23_1 {

    /**
     *  문제 : 특이한 정렬
     *
     *  정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
     *  정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     */
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] newArr = new int[answer.length];

        // 원소 중에서 기준 되는 원소와 차가 적은 수 를 다음에 배치

        int diff = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] == n) {
                answer[0] = numlist[i];
            }
        }

        Arrays.sort(numlist);

        for (int i = 1 ; i < answer.length; i++) {
            if (numlist[i] != n) {
                answer[i] = numlist[i];
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] numlist = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("[ result ] : " + Arrays.toString(solution(numlist, 4)));
    }

}
