package org.basic.day11;

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
        List<Character> list = new ArrayList<>();

        StringBuilder result = new StringBuilder();
        char[] charArray = my_string.toCharArray();


        for (int i=0; i<charArray.length; i++) {
            boolean removeChar = false;
            for (int index : indices) {
                if (index == i) {
                    removeChar = true;
                    break;
                }
            }
            if (!removeChar) {
                result.append(charArray[i]);
            }
        }

        return result.toString();
    }



} //class
