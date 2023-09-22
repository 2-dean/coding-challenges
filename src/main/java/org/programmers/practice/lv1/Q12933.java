package org.programmers.practice.lv1;

import java.util.Arrays;
import java.util.Collections;

public class Q12933 {

    /**
     *  문제 :정수 내림차순으로 배치하기
     *
     * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     *
     */
    public static long solution(long n) {
        long answer = 0;

        long length = (long) (Math.log10(n) + 1);
        Integer[] arr = new Integer[(int) length];


        for (int i = 0; i<length; i++) {
            arr[i] = (int) (n % 10);
            n = n / 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String num = "";
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        answer = Long.parseLong(num);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(132927));

    }

}
