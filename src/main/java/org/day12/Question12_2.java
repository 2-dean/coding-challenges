package org.day12;

import java.util.ArrayList;
import java.util.List;

public class Question12_2 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        int result = solution(num_list);

        System.out.println("√ result : " + result);
    }



    public static int solution(int[] num_list) {
        int answer = 0;

        for (int i=0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }



} //class
