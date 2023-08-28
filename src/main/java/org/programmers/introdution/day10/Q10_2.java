package org.programmers.introdution.day10;

import java.util.ArrayList;
import java.util.List;

public class Q10_2 {

    /**
     *  문제 :
     *  정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
     *  num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
     *
     * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고
     * n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
     * 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
     */
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            num_list.copy
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(solution(num_list, 3));
    }

}
