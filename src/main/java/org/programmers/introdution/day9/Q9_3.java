package org.programmers.introdution.day9;

import java.util.HashMap;
import java.util.Map;

public class Q9_3 {

    /**
     *  문제 :
     *  가위는 2 바위는 0 보는 5로 표현합니다.
     *  가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
     *  rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
     */
    public static String solution(String rsp) {
        String answer = "";

        char[] rspArr = rsp.toCharArray();
        for(char something : rspArr) {
            if(something == '2'){
                answer += '0';
            }
            if(something == '0'){
                answer += '5';
            }
            if(something == '5'){
                answer += '2';
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String rsp = "0";
        solution(rsp);
    }

}
