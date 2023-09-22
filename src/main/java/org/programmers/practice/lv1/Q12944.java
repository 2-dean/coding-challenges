package org.programmers.practice.lv1;

public class Q12944 {

    /**
     *  문제 :평균 구하기
     *  정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     *
     *  제한사항
     *  - arr은 길이 1 이상, 100 이하인 배열입니다.
     *  - arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
     */
    public static double solution(int[] arr) {
        double answer = 0;

        int length = arr.length;
        int sum = 0;
        // 1. 모든원소의 합 구하기
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        // 2. 모든 원소의 갯수로 나누기
        answer = (double) sum / length;


        return answer;

    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        System.out.println("result : " + solution(arr));
    }

}
