package org.basic.day11;

import java.util.ArrayList;
import java.util.List;

public class Question11_2 {

    public static void main(String[] args) {
        int[] result = solution(10, 3);

        System.out.println("[ result ] : " + result);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }


    static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        System.out.println("list: " + list.toString());

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }


} //class
