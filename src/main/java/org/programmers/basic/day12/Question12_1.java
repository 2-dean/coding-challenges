package org.programmers.basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Question12_1 {

    public static void main(String[] args) {
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = solution(3, slicer, num_list);
        for(int num : result) {
        System.out.println("√num : " + num);
        }
    }



    public static int[] solution(int n, int[] slicer, int[] num_list) {
        // slicer 에 담긴 정수를 차례대로 a,b,c 라고함
        //n = 1 : num_list 의 0번 인덱스부터 b번 인덱스까지
        //n = 2 : num_list 의 a번 인덱스부터 마지막 인덱스까지
        //n = 3 : num_list 의 a번 인덱스부터 b번 인덱스까지
        //n = 4 : num_list 의 a번 인덱스부터 b번 인덱스까지 c 간격으로

        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            for (int i = 0; i <= b; i++){
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++){
                list.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i<= b; i+=c){
                list.add(num_list[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i< list.size(); i++) {
            answer[i]= list.get(i);
        }

        return answer;
    }



} //class
