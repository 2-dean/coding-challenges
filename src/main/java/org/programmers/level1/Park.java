package org.programmers.level1;

import java.util.*;

public class Park {

    public static int[] solution(String[] park, String[] routes) {
        int[] now = new int[]{-1,-1};
        int H = park.length, W = park[0].length();
        Set<String> xSet = new HashSet<String>();


        // 공원에서 시작 위치 찾기 및 장애물 찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') now = new int[]{i, j};  // 시작 위치
                if (park[i].charAt(j) == 'X') xSet.add(i + "," + j);  // 장애물 위치
            }
        }

        // 이동 방향 설정
        Map<String, int[]> directions = Map.of(
                "E", new int[]{0, 1}, "W", new int[]{0, -1},
                "S", new int[]{1, 0}, "N", new int[]{-1, 0}
        );

        // 움직이기
        for (String route : routes) {
            String[] r = route.split(" ");

            String dir = r[0]; // 방향
            int dot = Integer.parseInt(r[1]); // 이동거리

            int dx = directions.get(dir)[0], dy = directions.get(dir)[1];
            int nx = now[0], ny = now[1]; // 임시 좌표

            boolean canMove = true;  // 이동할 수 있는지 여부
            for (int i = 1; i <= dot; i++ ) {
                int tx = now[0] + dx * i; // 현재위치 + 방향+거리
                int ty = now[1] + dy * i;

                //범위를 벗어나면 이동 X
                if (tx < 0 || tx >= H || ty < 0 || ty >= W ||  xSet.contains(tx + "," + ty)){
                    canMove = false;
                    break;
                }

                //이동 가능한 좌표로 업데이트
                nx = tx;
                ny = ty;
            }

            if (canMove) now = new int[] {nx, ny};
        }


        return now;

    }

    public static void main(String[] args) {
        solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"});
    }
}
