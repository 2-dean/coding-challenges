package org.day11;

import java.util.ArrayList;
import java.util.List;

public class Question11_3 {

    public static void main(String[] args) {
        String my_stirng = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String result = solution(my_stirng, indices);

        System.out.println("[ result ] : " + result);

    }


    static String solution(String my_string, int[] indices) {
        List<Integer> list = new ArrayList<>();

        System.out.println("list: " + list.toString());

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        String result = "";

        return result;
    }



} //class
