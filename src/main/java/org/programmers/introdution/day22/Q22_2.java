package org.programmers.introdution.day22;

public class Q22_2 {

    /**
     *  문제 :평행
     *
     *  점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
     *
     * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
     * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
     *
     */
    public static int solution(int[][] dots) {

        // [0, 1, 2, 3]
        // index 0,1 과 2,3비교
        // index 0,2 과 1,3비교
        // index 0,3 / 1,2비교

        double m1 = getSlope(dots[0], dots[1]);
        double m2 = getSlope(dots[2], dots[3]);

        double m3 = getSlope(dots[0], dots[2]);
        double m4 = getSlope(dots[1], dots[3]);

        double m5 = getSlope(dots[0], dots[3]);
        double m6 = getSlope(dots[1], dots[2]);


        if (m1 == m2 || m3 == m4 || m5 == m6) {
            return 1;
        }  else {
            return 0;
        }
    }
    // 기울기 구하기
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
