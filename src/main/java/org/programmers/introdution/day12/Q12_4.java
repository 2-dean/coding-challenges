package org.programmers.introdution.day12;

import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.*;

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

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        //1. N을 모든 숫자와 나누기 n을 2부터 나누는데 나누어 떨어지면 나누는 숫자는 n의 인수가된다
        // 간단하지만 n이 커질수록 효율적이지 못함
        int k = 2;
        while (n != 1) {
            if (n % k == 0) {
                //N을 k로 나눈 값으로 N의 값을 다시 수정
                n /= k;
                map.put(k, map.getOrDefault(k, 1));
            } else {
                k ++;
            }
        }

        int[] answer = new int[map.size()];
        for (Integer integer : map.keySet()) {
            list.add(integer);
        }
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + Arrays.toString(solution(12)));
    }

}
