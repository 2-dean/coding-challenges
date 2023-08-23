package org.programmers.basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Question12_4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};

        int[] result = solution(arr);

        System.out.println("√ result : " + result);
    }



    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start != -1 && end != -1) {
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
            }
        } else {
            list.add(-1);
        }


        System.out.println("list " + list.toString());

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }


} //class
