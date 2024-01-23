package org.programmers.basic.day15;

public class Q15_5 {

    /**
     *  문제 :원하는 문자열 찾기
     */
    public static int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0 ;

    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
    }

}
