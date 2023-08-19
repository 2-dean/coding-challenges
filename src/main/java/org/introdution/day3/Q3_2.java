package org.introdution.day3;

import java.util.ArrayList;
import java.util.List;

public class Q3_2 {

    /**
     * 정수 n이 매개변수로 주어질 때,
     * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=n;) {
            list.add(i);
            i +=2;
        }
        int[] arr = new int[list.size()];
        for (int i=0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] result = solution(10);

    }

}
