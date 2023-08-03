package org.day14;

import java.util.ArrayList;
import java.util.List;

public class Question14_2 {

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] result = solution(names);

        System.out.println("result : " + result);

    }



    public static String[] solution(String[] names) {
        String[] answer = {};

        List<String> list = new ArrayList<>();

        for (int i=0; i<names.length; i++){
            if(i% 5==0){
                list.add(names[i]);
            }
        }
        return list.toArray(new String[0]);

    }



} //class
