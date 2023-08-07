package org.basic.day13;

import java.util.ArrayList;
import java.util.List;

public class Question13_2 {

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6}; //{5, 2, 1, 7, 5}
        int n = 1;

        int[] result = solution(num_list, n);
        for(int num : result) {
        System.out.println("√num : " + num);
        }
    }



    public static int[] solution(int[] num_list, int n) {
        //정수 리스트 num_list와 정수 n이 주어질 때,
        // num_list를 n 번째 원소 이후의 원소들 (A)과 n 번째까지의 원소들(B)로 나눠
        // n 번째 원소 이후의 원소들(A)을 n 번째까지의 원소들(B) 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
        List<Integer> list = new ArrayList<>();

        // (A)
        for(int i=n; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        // (B)
        for (int i=0; i<= n-1; i++){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }



} //class
