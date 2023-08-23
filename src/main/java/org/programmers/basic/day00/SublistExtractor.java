package org.programmers.basic.day00;

import java.util.ArrayList;
import java.util.List;

public class SublistExtractor {

    static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<num_list.length; i++) {
            if (i+1 >= n) {
                list.add(num_list[i]);
            }
        }

        int[] answer = new int[list.size()] ;
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }




    public static void main(String[] args) {
        int[] num_list = {1,2,6};
        int[] result = solution(num_list, 3);
        System.out.println("-- result --");
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
