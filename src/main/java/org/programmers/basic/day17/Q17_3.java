package org.programmers.basic.day17;

import java.util.Arrays;

public class Q17_3 {

    /**
     *  문제 :
     */
    public static String[] solution(String[] strArr) {

        int length = 0;
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")){
                length++;
            }
        }
        System.out.println(length);
        String[] answer = new String[length];
        int index = 0;
        for (int i = 0; i  < strArr.length ; i ++) {
            if(!strArr[i].contains("ad")){
                answer[index] = strArr[i];
                index++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and", "notad", "abcd"})));
    }

}
