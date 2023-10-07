package org.programmers.practice.lv1;

import java.util.Arrays;

public class Q134240 {

    /**
     *  문제 :푸드 파이트 대회
     */
    public static String solution(int[] food) {
        String answer = "";
        int length = 1 ;
        // 제공할 음식 배열만들기
        int[] useFood = food.clone();
        for (int i = 1; i< useFood.length; i++) {
            if (useFood[i] % 2 != 0) {
                useFood[i] = useFood[i] - 1;
            }
            //useFood[i] /= 2;
            length+= useFood[i];
        }


        int[] arr = new int[length];

        //arr[length/2] = 0;
        int k=0;
        for (int i = 0; i < useFood.length; i++) {
            int num = useFood[i]/2;
            for (int j = 0; j < num; j++) {
                arr[k++] = i;
                arr[arr.length - k] = i;
            }
        }

        for (int s : arr) {
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,6}));
    }

}
