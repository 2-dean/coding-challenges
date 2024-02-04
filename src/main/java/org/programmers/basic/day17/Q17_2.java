package org.programmers.basic.day17;

public class Q17_2 {

    /**
     *  문제 :
     */
    public static int solution(String myString, String pat) {
        int answer = 1;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String target = myString.substring(i, i+pat.length());


            if (target.equals(pat)) answer++;
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
    }

}
