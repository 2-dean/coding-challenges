package org.introdution.day3;

import java.util.Arrays;

public class Q3_1 {

    public static int solution(int[] array) {



        Arrays.sort(array);
        // 중간 인덱스
        int length = array.length;
        int middleIdx = length/2;
        return middleIdx;


    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int result = solution(numbers);
//        for(int num : result){
//            System.out.println(num);
//        }
    }

}
