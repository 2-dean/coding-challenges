package org.basic.day9;

public class TrailingSubstringExtractor {

    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        String result = solution(my_string, n);
        System.out.println("[ result ] : " + result);
    }


    static String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n, my_string.length());
        return answer;
    }


}
