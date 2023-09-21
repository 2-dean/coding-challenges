package org.boj.part1;

import java.util.Scanner;

/*
* [10250] ACM 호텔
*
* */
public class Main_10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // testcase 수

        int floor = 1;      // 층
        int distance = 1;   // 엘베까지 거리 (호수)
        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            while (--N > 0) {
                floor++;
                if (floor > H) {
                    floor = 1;
                    distance++;
                }
            }

            System.out.printf("%d%02d\n",floor,distance);
        }
        // 한번에 계산하기
     /*   while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int distance = (N - 1) / H + 1; //1호부터 시작
            int floor = (N - 1) % H + 1;

            System.out.printf("%d%02d\n",floor,distance);
        }*/

    }

}
