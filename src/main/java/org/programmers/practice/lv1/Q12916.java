package org.programmers.practice.lv1;

public class Q12916 {

    /**
     *  문제 :문자열 내 p와 y의 개수
     */
    public static  boolean solution(String s) {

        int countP = 0;
        int countY = 0;
        String str = s.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'P') countP++;
            if (str.charAt(i) == 'Y') countY++;
        }

        if (countP == 0 && countY == 0) {
            return true;
        } else if (countP == countY) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("result : " +  solution("pPoooyY"));
    }

}
