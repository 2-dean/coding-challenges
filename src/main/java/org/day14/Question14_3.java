package org.day14;

import java.util.ArrayList;
import java.util.List;

public class Question14_3 {

    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        String[] result = solution(todo_list, finished);

        for (String s : result) {

            System.out.println("result : " + s);
        }

    }



    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};

        List<String> list = new ArrayList<>();

        for (int i=0; i<todo_list.length; i++){
            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);

    }



} //class
