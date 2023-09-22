package org.programmers.practice.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12910 {

    /**
     *  문제 :나누어 떨어지는 숫자 배열
     *
     *  array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
     * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     *
     */
    public static int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int[] minusArr = new int[]{-1};
        int[] answer = new int[list.size()];
        if (list.size() == 0) {
            return minusArr;
        } else {
            for (int i = 0; i< list.size(); i++) {
                answer[i] = list.get(i);
            }

            Arrays.sort(answer);
            return answer;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int[] solution = solution(arr, 5);
        System.out.println(Arrays.toString(solution));
    }

}
