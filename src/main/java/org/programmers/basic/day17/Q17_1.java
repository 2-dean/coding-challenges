package org.programmers.basic.day17;

import java.util.Arrays;

public class Q17_1 {

    /**
     *  문제 :
     */
    public static String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat);

        if (index != -1) {
            answer = myString.substring(0, index) + pat;
        }

        return answer;

    }

    public static void main(String[] args) {
        solution("AAAAaaaa","a");
    }

}
