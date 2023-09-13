package org.programmers.introdution.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q13_4 {

    /**
     *  문제 :선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
     *
     * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
     * 삼각형의 세 변의 길이가 담긴 배열 sides 이 매개변수로 주어집니다.
     * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return 하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int[] sides) {
        int answer = 0;

        // 가장 큰 변의 길이가 나머지 두 변의 길이의 합과 같으면 X = 2
        // 가장 큰 변의 길이가 나머지 두 변의 길이의 합보다 크면 X = 2
        // 가장 큰 변의 길이가 나머지 두 변의 길이의 합보다 작으면 O = 1

        // 가장 큰 변의 길이 찾기
        Arrays.sort(sides);

        int max = sides[2];
        int side1 = sides [0];
        int side2 = sides [1];
//        System.out.println("max side : " + max);
//        System.out.println("side1 : " + side1);
//        System.out.println("side2 : " + side2);
        // 나머지 두 변의 길이의 합 구하기
        int otherSide = side1 + side2;

        if (max >= otherSide) {
            answer = 2;
        } else {
            answer = 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{199, 199, 199}));
    }

}
