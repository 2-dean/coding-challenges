package org.introdution.day4;

public class Q4_4 {

    /**
     *  문제 :
     * 정수 배열 numbers가 매개변수로 주어집니다.
     * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
     */

    public static double solution(int[] numbers) {
        double all = 0;
        for (int num : numbers) {
            all += num;
        }
        System.out.println(all);
        System.out.println(numbers.length);
        return all/numbers.length;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = solution(numbers);
        System.out.println("result : " + result);
    }

}
