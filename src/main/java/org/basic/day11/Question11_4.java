package org.basic.day11;

import java.util.ArrayList;
import java.util.List;

public class Question11_4 {

    public static void main(String[] args) {
    // 정수 start와 end가 주어질 때, start에서 end까지
    // 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        int[] result = solution(10, 3);
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }


    static int[] solution(int start, int end) {

        List<Integer> list = new ArrayList<>();
        for (int i = start; i >= end; i-- ) {
            list.add(start-i, i);
        }
        int[] answer = new int[list.size()];

        for (int j = 0; j<answer.length; j++){
            answer[j] = list.get(j);
        }


        return answer;
    }


} //class
