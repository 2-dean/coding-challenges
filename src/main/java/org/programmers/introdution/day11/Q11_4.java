package org.programmers.introdution.day11;

import java.sql.SQLOutput;

public class Q11_4 {

    /**
     *  문제 :
     *  i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
     *  정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
     *
     * i! ≤ n
     */
    public static int solution(int n) {
        int answer = 0;

        int factorial = reverseFactorial(7);

        return factorial;
    }

    static int reverseFactorial(int result) {
        int num = 1;
        int factorial = 1;

        while (factorial < result) {
            num++;
            factorial *= num;
            if(factorial > result) {
                return num-1;
            }
        }
        if (factorial == result) {
            return num;
        } else {
            return  -1;
        }


    }

    public static void main(String[] args) {

        System.out.println(solution(7));
    }

}
