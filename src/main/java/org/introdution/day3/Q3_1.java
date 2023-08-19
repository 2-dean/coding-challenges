package org.introdution.day3;

import java.util.Arrays;

public class Q3_1 {
    // 중앙값 구하기

    /**
     * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
     * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때,
     * 중앙값을 return 하도록 solution 함수를 완성해보세요.
     * */
    public static int solution(int[] array) {



        Arrays.sort(array);
        // 중간 인덱스
        int length = array.length;
        int middleIdx = length/2;
        System.out.println("middleIdx = " + middleIdx);
        System.out.println("array[middleIdx] = " + array[middleIdx]);

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
