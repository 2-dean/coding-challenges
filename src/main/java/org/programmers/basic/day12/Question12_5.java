package org.programmers.basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question12_5 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
        int[] query = {4, 1, 2};
        int[] result = solution(arr, query);

        System.out.println("√ result : " + result);
    }



    public static int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i=0; i< arr.length; i++) {

            if (i % 2 == 0){
                //짝수
               arr = Arrays.copyOfRange(arr,0,query[i]+1);
            } else {
                // 홀수 인덱스
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
            System.out.println("list : " + list.get(i));
        }
        return answer;
    }

} //class
