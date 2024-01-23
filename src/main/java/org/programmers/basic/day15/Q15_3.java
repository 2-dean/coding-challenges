package org.programmers.basic.day15;

import java.util.Arrays;

public class Q15_3 {

    /**
     *  문제 : 1로 만들기
     */
    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i=0; i< num_list.length; i++) {
            while (num_list[i] != 1){

                // 홀짝 판별
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] -= 1;
                    num_list[i] /= 2;
                    answer++;
                }
            }

        }
        return answer;

    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(solution(num_list));;

    }

}
