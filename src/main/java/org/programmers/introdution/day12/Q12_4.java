package org.programmers.introdution.day12;

import java.util.Arrays;

public class Q12_4 {

    /**
     *  문제 :
     *  소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
     *  예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
     *  따라서 12의 소인수는 2와 3입니다.
     *  자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     *
     *
     *  소인수분해 :  합성수를 소수로 분해하는 것

     */
    public static int[] solution(int n) {
        int[] answer = {};


        // 약수의 갯수
        for (int i = 1; i <= n; ++i){
            //if 합성수면 answer++  아니면 넘어감
            // 합성수?
            int count = 0;
            for(int j= 1; j<=i; ++j) {
                if(i % j == 0) {
                    // 약수 여부를 판단
                    count++;
                }
            }
            if (count >= 3) {

            }
        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + Arrays.toString(solution(12)));
    }

}
