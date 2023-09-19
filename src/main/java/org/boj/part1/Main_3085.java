package org.boj.part1;

import java.util.Scanner;

/*
* [3085] 사탕게임
*
* 1. 가능한 모든 쌍의 사탕을 서로 교환한다 ( 오른쪽과, 아랫쪽 방향으로만 교환 => 중복교환은 안함!)
* 2. 교환한 상태에서 가장 긴 연속부분 행/열을 찾는다
* 3. 교환한 사탕을 원복한다
* */
public class Main_3085 {

    // 가장 긴 연속 열 (가로)
    // 가장 긴 연속 행 (세로)
    // 연속성 판단 -  이전값과 비교하여 연속성 판단


    public static void swapCandy(char[][] map, int r1, int r2, int c1, int c2) {
        char temp = map[r1][r2];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }
    public static int findMaxRow(char[][] map) {
        // 맵을 전부 돌면서 가장 긴거를 찾음
        int N = map.length;
        int mawRow = 0;
        for (int r = 0; r < N; r++) {
            int len = 1;
            // 이전값을 이용한 연속성 판단
            for (int c = 0 ; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) len++;
                else {
                    mawRow = Math.max(mawRow, len);
                    len = 1;
                }
            }
            mawRow = Math.max (mawRow, len);
        }
        return mawRow;
    }

    public static int findMaxColumn(char[][] map) {
        // 맵을 전부 돌면서 가장 긴거를 찾음
        int N = map.length;
        int mawCol = 0;
        for (int c = 0; c < N; c++) {
            int len = 1;
            // 이전값을 이용한 연속성 판단
            for (int r = 0 ; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) len++;
                else {
                    mawCol = Math.max(mawCol, len);
                    len = 1;
                }
            }
            mawCol = Math.max (mawCol, len);
        }
        return mawCol;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        int ans = 0;
        for (int i =0; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != map [i][j+1]) { // 오른쪽 교환
                    swapCandy(map, i, j, i, j+1);
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map)));
                    swapCandy(map, i, j, i, j+1); // 원복
                }
                if (map[i][j] != map [i+1][j]) { // 아래쪽 교환
                    swapCandy(map, i, j, i+1, j);
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map)));
                    swapCandy(map, i, j, i+1, j); // 원복
                }
            }
        }


    }



}
