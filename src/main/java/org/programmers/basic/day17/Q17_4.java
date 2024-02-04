package org.programmers.basic.day17;

import java.util.Arrays;

public class Q17_4 {

    /**
     *  문제 :
     */
    public static String[] solution(String strArr) {

        return strArr.split(" ");

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
    }

}
