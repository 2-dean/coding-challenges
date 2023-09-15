package org.boj.part1;

import java.util.Scanner;

/*
* 문제 : 유레카 이론
* 4 = T1 + T2
* 5 = T1 + T1 + T2
* 6 = T2 + T2 or 6 = T3
* 10 = T1 + T2 + T3 or 10 = T4
*
* 삼각수 = n(n+1)/2
*
* 주어진 k 가 정확히 3개의 삼각수의 합으로 표현될  수 있는가?
*
* 풀이 :
* 1. 모든 삼각수를 구한다
* 2. 주어진 숫자를 세개의 삼각수의 합으로 표현할 수 있는지 확인한다.
*
* 가장쉬운방법 :  3중 for 문으로 3개의 삼각 수 합이 k와 일치하는지 확인 => 시간복잡도 O(삼각수의갯수^3)
*
* K보다 작은 삼각수만 구하면 된다 K는 최대 1000
* */
public class Main_10448 {

    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        // 1. K보다 작은 삼각수 구하기
        int[] triangleNumbers = new int[50]; // 44개지만 넉넉하게 50으로
        int triangleNumberCount = 0;
        for (int i = 1;  ; i++) {
            int triangleNumber = i * (i + 1) /2;
            if (triangleNumber > 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }
         // 2. 구해진 삼각수 세개의 합으로 K를 나타낼 수 있는지 확인
        for (int i = 0; i < triangleNumberCount; i++)
            for (int j = i; j < triangleNumberCount; j++)
                for (int k = j; k < triangleNumberCount; k++) {
                    int eurekaNumber = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k];
                    if (eurekaNumber > 1000) break;
                    isEurekaNumber[eurekaNumber] = true;
                }
    }
    public static void main(String[] args) {
        preprocess();
        // K의 범위 : [3, 1000]
        // isEurekaNumber[]
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();

            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }
}
