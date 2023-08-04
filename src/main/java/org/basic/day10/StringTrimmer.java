package org.basic.day10;

public class StringTrimmer {

    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        String result = solution(my_string,11);
        System.out.println("[ result ] : " + result);
    }


    static String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(0,n);
        return answer;
    }


} //class
