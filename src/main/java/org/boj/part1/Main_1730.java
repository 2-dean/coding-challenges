package org.boj.part1;

import java.util.Scanner;

/*
* [1730] 판화

* */
public class Main_1730 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String command = sc.hasNext() ? sc.next() : "";


        boolean[][] passVertical = new boolean[N][N];   // 세로 경유 체크용
        boolean[][] passHorizontal = new boolean[N][N]; // 가로 경유 체크용

        // 로봇 팔의 현재위치
        int currR = 0;
        int currC = 0;

        // 명령어에 따라 움직이며 흔적 남기기
        for (int i= 0; i < command.length(); i++) {
            char cmd = command.charAt(i);
            if (cmd == 'D') {
                if (currR == N - 1) continue;
                passVertical[currR][currC] = true;
                passVertical[currR + 1][currC] = true;
                currR++;
            } else if (cmd == 'U') {
                if (currR == 0) continue; // 마지막 인덱스?
                passVertical[currR][currC] = true;
                passVertical[currR -1][currC] = true;
                currR--;
            } else if (cmd == 'L') {
                if (currC == 0) continue;
                passHorizontal[currR][currC] = true;
                passHorizontal[currR][currC - 1] = true;
                currC--;
            } else { //cmd == 'R'
                if (currC == N -1) continue;
                passHorizontal[currR][currC] = true;
                passHorizontal[currR][currC + 1] = true;
                currC++;
            }
        }

        // 출력

        for (int i = 0; i < N; i++) {
            String answer = "";
            for (int j = 0; j < N; j++){
                if (passHorizontal[i][j] && passVertical[i][j]) answer += "+";
                else if (passVertical[i][j]) answer += "|";
                else if (passHorizontal[i][j]) answer += "-";
                else answer += ".";
            }
            System.out.println(answer);
        }

    }

}
