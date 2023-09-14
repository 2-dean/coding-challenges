package org.boj.part1;

import java.util.Scanner;

public class Main_1236 {
    /*
    * 문제: 영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
    * 영식이는 *모든 행과 모든 열*에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
    * 성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야
    *  영식이를 만족시키는지 구하는 프로그램을 작성하시오.
    *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int N = sc.nextInt(); // 열 ROW
        int M = sc.nextInt(); // 행 COL
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }
        // 1. 각 행,열에 대해 경비원이 있는지 확인
        int existRowCount = 0;
        for (int r =0; r < N; r++) {
            boolean exist = false;
            for (int c = 0; c < M; c++) {
                if(map[r][c] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) existRowCount++;
        }

        int existColCount = 0;
        for (int c = 0; c < M; c++) {
            boolean exist = false;
            for (int r = 0; r < N; r++) {
                if(map[r][c] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) existColCount++;
        }



        // 2. 보호받지 못하는 행,열의 개수 구한다
        int needRowCount = N - existRowCount;
        int needColCount = N - existColCount;

        // 3. 행,열중 더 큰값을 출력
        System.out.println(Math.max(needRowCount, needColCount));


    }
}
