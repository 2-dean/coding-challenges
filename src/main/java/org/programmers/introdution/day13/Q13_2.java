package org.programmers.introdution.day13;

public class Q13_2 {

    /**
     *  문제 : 문자열 배열 strlist가 매개변수로 주어집니다.
     *  strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            int length = strlist[i].length();
            answer[i] = length;

        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"I", "Love", "Programmers."});
    }

}
