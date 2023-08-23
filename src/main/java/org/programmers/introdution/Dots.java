package org.programmers.introdution;

public class Dots {

    public static int solution(int[][] dots) {

        // index 0,1 과 2,3비교
        // index 0,2 과 1,3비교
        // index 0,3 / 1,2비교

        // 0,1,2,3
        // 01, 02, 03
        // 12, 13
        // 23
        // 기울기 구하기
        double m1 = getSlope(dots[0], dots[1]);
        double m2 = getSlope(dots[2], dots[3]);

        double m3 = getSlope(dots[0], dots[2]);

        double m4 = getSlope(dots[1], dots[3]);

        double m5 = getSlope(dots[0], dots[3]);
        double m6 = getSlope(dots[1], dots[2]);



        if (m1 == m2 || m1 == m4 || m2 == m3 || m3 == m4 || m5 == m6) {
            return 1;
        }  else {
            return 0;
        }
    }
    private static double getSlope(int[] p1, int[] p2) {
        if (p1[0] == p2[0]) {
            return 0;
        } else {
            return (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
        }
    }
    public static void main(String[] args) {
        int[][] dots = {{1,4},{9,2},{3,8},{11,6}};

        int result = solution(dots);
        System.out.println("result : " + result);
    }
}
