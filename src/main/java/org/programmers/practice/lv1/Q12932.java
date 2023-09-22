package org.programmers.practice.lv1;

import java.util.Arrays;

public class Q12932 {

    /**
     *  문제 :자연수 뒤집어 배열로 만들기
     *
     *  자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     *
     *  n은 10,000,000,000이하인 자연수입니다.
     */
    public static  int[] solution(long n) {
        long num = n; // 입력 숫자를 보존하기 위한 변수
        int length = (int) Math.log10(num) + 1; // 입력 숫자의 자릿수 계산
        // Math.log10 =>함수는 주어진 숫자의 10을 밑으로 하는 로그 값을 반환
        int[] answer = new int[length]; // 결과를 저장할 배열

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (num % 10); // 숫자를 뒤집어 배열에 저장
            num /= 10; // 가장 오른쪽 자릿수를 제거
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + Arrays.toString(solution(12345)));
    }

}
