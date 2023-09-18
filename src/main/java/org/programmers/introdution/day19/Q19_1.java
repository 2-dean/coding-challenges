package org.programmers.introdution.day19;

import java.util.Arrays;

public class Q19_1 {

    /**
     *  문제 : 7의 개수
     *
     *  - 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String number = String.valueOf(array[i]);
            for (int j = 0; j < number.length(); j++) {
                if(number.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " +  solution(new int[]{10, 29}));
    }

}
