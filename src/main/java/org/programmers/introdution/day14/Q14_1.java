package org.programmers.introdution.day14;

import java.util.Arrays;

public class Q14_1 {

    /**
     *  문제 : 가까운 수
     *  정수 배열 array와 정수 n이 매개변수로 주어질 때,
     *  array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int[] array, int n) {
        int answer = 0;
        // array 의 원소 중 n과의 값의 차가 가장 작은 수를 찾기
        // 값의 차
        int diff = 99;
        int min = 0;
        Arrays.sort(array);
        for (int num : array) {
            if (Math.abs(n - num) < diff) {
                diff = Math.abs(n - num);
                min = num;
            }
            System.out.println("num : " + num  + ", diff : " + diff);
            // 값의 차가 같을 경우 더 작은 수를 리턴
            if(Math.abs(n - num) == diff) {
                if (n < min) {
                    min = num;
                }
            }
            System.out.println("min " + min);
        }
        answer = min;
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{3, 10, 28}, 20);
        System.out.println("result : " + result);
    }

}
