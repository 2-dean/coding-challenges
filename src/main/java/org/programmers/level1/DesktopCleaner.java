package org.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class DesktopCleaner {
    public static int[] solution(String[] wallpaper) {

        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE; // 아주 큰값으로 초기화 > 최솟값 구할때 갱신됨
        int rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE; // 아주 작은 값으로 초기화 > 최댓값 구할때 갱신됨 아하

        // 제일 앞점 ? //제일끝점 좌표 담아서 리턴
        // map사용 불필요
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0 ; j < wallpaper[i].length(); j++) {
                 if (wallpaper[i].charAt(j) == '#') {
                     // lux, luy (최소값 갱신)
                     lux = Math.min(lux, i);
                     luy = Math.min(luy, j);
                     // rdx, rdy (최대값 갱신)
                     rdx = Math.max(rdx, i + 1);  // rdx는 끝점을 포함해야 해서 +1
                     rdy = Math.max(rdy, j + 1);  // rdy도 끝점을 포함해야 해서 +1

                 }
            }
        }
        System.out.println("lux: "+ lux + ", luy: " + luy + ", rdx: " + rdx + ", rdy: " + rdy);


        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }

    public static void main(String[] args) {
      /*  solution(new String[] {".#..."
                                , "..#.."
                                , "...#."});*/
        solution(new String[] {".........."
                             , ".....#...."
                             , "......##.."
                             , "...##....."
                             , "....#....."});
       /*
        solution(new String[] {   ".##...##."
                                , "#..#.#..#"
                                , "#...#...#"
                                , ".#.....#."
                                , "..#...#.."
                                , "...#.#..."
                                , "....#...."});*/
    }
}
