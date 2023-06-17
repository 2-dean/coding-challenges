package org.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringConcatenator {

    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        String result = solution(my_strings, parts);
        System.out.println("[ result ] : " + result);
    }


    static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i=0; i< my_strings.length; i++){
            answer += my_strings[i].substring( parts[i][0],parts[i][1]+1);
           }
        return answer;
    }
}
