package org.programmers.introdution.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_4 {

    /**
     *  문제 : 약수 구하기
     *  정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int n) {

        List<Integer> list = new ArrayList<>();
        // 약수구하기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }

        int[] answer = new int[list.size()];

        // 오름차순으로 정렬
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + Arrays.toString(solution(24)));
    }

}
