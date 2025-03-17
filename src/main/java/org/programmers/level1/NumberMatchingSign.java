package org.programmers.level1;

import java.util.Arrays;

public class NumberMatchingSign {
    /*
    두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을
    이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
     X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

    예를 들어, X = 3403이고 Y = 13203이라면,
    X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다.
    다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은
    X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
    (X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
    두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
     "100"	"2345"	"-1"
    "100"	"203045"	"0"
    "100"	"123450"	"10"
    "12321"	"42531"	"321"
    "5525"	"1255"	"552"
     */
    public static String solution(String X, String Y) {
        /* 구현
            두 수중에서 큰 숫자 찾기
            중복된 숫자 찾기 -> 큰 숫자를 charArray로 만들어서
            안에서 작은 숫자 for문 돌려서 중복된 숫자를 array 에 담기
            배열을 내림차순으로 정렬하기
            중복된 숫자가 없다면 -1 리턴

        */

        /* 더 나은 방법
         각 숫자의 등장 횟수를 세서 최소값을 사용하는 방식이 더 효율적이야.
         특히 숫자의 길이가 길어질수록 탐색보다는 빈도수를 활용하는 방식이 성능이 좋을 거야.
        */
        int[] xArray = new int[10]; // X의 숫자 개수 저장
        int[] yArray = new int[10]; // Y의 숫자 개수 저장

        // X의 숫자 개수 저장
        for (char c : X.toCharArray()) {
            xArray[c - '0']++;
        }
        // Y의 숫자 개수 저장
        for (char c : Y.toCharArray()) {
            yArray[c - '0']++;
        }

        StringBuilder number = new StringBuilder();

        for (int i = 9; i>=0; i--) {
            int count = Math.min(xArray[i], yArray[i]); // 공통으로 있는 갯수
            for(int j=0; j<count; j++){
                number.append(i);
            }

        }
        // 공통된 숫자가 없다면 "-1" 리턴
        if (number.length() == 0) {
            return "-1";
        }

        // "0"으로만 이루어져 있다면 "0" 리턴
        if (number.toString().startsWith("0")) {
            return "0";
        }
        System.out.println("number : "+ number);
        return number.toString();
    }

    public static void main(String[] args) {
        solution("100", "2345");
        solution("100", "203045");
        solution("100", "123450");
        solution("12321", "42531");
        solution("5525", "1255");
    }
}
