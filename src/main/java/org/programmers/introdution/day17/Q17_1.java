package org.programmers.introdution.day17;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q17_1 {

    /**
     *  문제 : 숫자 찾기
     *  정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int num, int k) {
        int answer = 0; // 자리수

        // int 를 자릿수별 int[]로 분할
        String stringNum = Integer.toString(num);

        int[] numArr = new int[stringNum.length()];
        for (int i = 0; i < stringNum.length(); i++) {
            numArr[i] = stringNum.charAt(i) - '0';
        }

        // num의 첫번째 부터 k 가 있는지 확인
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i] == k);
            if (numArr[i] == k) {
                // 있으면 자리수 리턴
                answer = i + 1;
                break;
            } else {
                // 없으면 -1 리턴
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(29183, 1));
    }

}
