package org.day13;

import java.util.ArrayList;
import java.util.List;

public class Question13_5 {

    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6}; //{5, 2, 1, 7, 5}
        int n = 2;

        int[] result = solution(num_list, n);

        for(int num : result) {
            System.out.println("√num : " + num);
        }
    }



    public static int[] solution(int[] num_list, int n) {
        // 정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는
        // 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<num_list.length;) {
            list.add(num_list[i]);
            i += n;
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
           answer[i] = list.get(i);
        }
        return answer;
    }



} //class
