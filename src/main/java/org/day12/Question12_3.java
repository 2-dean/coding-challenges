package org.day12;

import java.util.ArrayList;
import java.util.List;

public class Question12_3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1,3}, {0,4}};

        int[] result = solution(arr, intervals);

        System.out.println("√ result : " + result);
    }



    public static int[] solution(int[] arr, int[][] intervals) {


        int firstStart = intervals[0][0];
        int firstEnd = intervals[0][1];

        int secondStart = intervals[1][0];
        int secondEnd = intervals[1][1];

        int listSize = ((firstEnd-firstStart)+1) + ((secondEnd-secondStart)+1);

        List<Integer> list = new ArrayList<>();

        for (int i= firstStart; i<=firstEnd; i++) {
            list.add(arr[i]);
        }

        for (int i= secondStart; i<=secondEnd; i++) {
            list.add(arr[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }



} //class
