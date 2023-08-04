package org.basic.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder5 {

    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] result = solution(intStrs, k, s, l);
        System.out.println("[ result ] : " + Arrays.stream(result).toArray());
    }


    static int[] solution(String[] intStrs, int k, int s, int l) {


        List<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            String sliceStr = intStr.substring(s,s+l);
            int sliceInt = Integer.parseInt(sliceStr);
            if (sliceInt > k) {
                System.out.println("sliceInt > k " + sliceInt);
                list.add(sliceInt);
            }
        }
        System.out.println("list "+ list.get(0));
        System.out.println("list "+ list.get(1));
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
