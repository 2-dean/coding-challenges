package org.programmers.practice.lv1;

public class Q12922 {

    /**
     *  문제 :수박수박수박수박수박수?
     *  길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
     *  예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
     *
     *  n은 길이 10,000이하인 자연수입니다.
     *
     */
    public static String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n ; i++) {
            if (i%2 != 0){
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }

}
