package org.programmers.practice.lv1;

import java.util.Arrays;

public class Q86051 {

    /**
     *  문제 :없는 숫자 더하기
     *
     *  0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
     *  numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int[] numbers) {
        int answer = 0;
        int[] number = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int idx = numbers[i];
            number[idx]++;
        }
        System.out.println(Arrays.toString(number));

        for (int i = 0; i< number.length; i++) {
            if (number[i] == 0) {
                answer+= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,6,7,8,0};
        System.out.println("result : "+ solution(numbers));
    }

}
