package org.programmers.practice.lv1;

public class Q12919 {

    /**
     *  문제 :
     */
    public static  String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i< seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i +"에 있다";
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        String[] seoul = new String[]{"Jane", "Kim"};
    }

}
