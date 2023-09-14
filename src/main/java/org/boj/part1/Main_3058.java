package org.boj.part1;

import java.util.Arrays;
import java.util.Scanner;

    /*
    * 문제 : 짝수를 찾아라
    * 7개의 자연수가 주어질 때, 이들 중 짝수인 자연수들을 모두 골라 그 합을 구하고, 고른 짝수들 중 최솟값을 찾는 프로그램을 작성하시오.

    예를 들어, 7개의 자연수 13, 78, 39, 42, 54, 93, 86가 주어지면 이들 중 짝수는 78, 42, 54, 86이므로 그 합은 78 + 42 + 54 + 86 = 260 이 되고,
    *  42 < 54 < 78 < 86 이므로 짝수들 중 최솟값은 42가 된다.
     *
    * */
public class Main_3058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i ++) {
            int[] numbers = new int[7]; // 7개의 자연수를 저장할 배열
            int min = 101;
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                numbers[i] = sc.nextInt(); // 받으면서 바로저장
                if (numbers[i] % 2 == 0) {
                    sum += numbers[i] ;
                    if (min > numbers[i] ) {
                        min = numbers[i] ;
                    }
                }

            }
            System.out.println(sum + " " + min);
        }

    }
}
