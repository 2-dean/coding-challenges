package org.programmers.introdution.day22;

import java.util.Arrays;

public class Q22_3 {

    /**
     *  문제 :겹치는 선분의 길이
     *
     *  선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는
     *  2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
     */
    public static  int solution(int[][] lines) {
        int answer = 0;
        int[] range = new int[201]; // 구간 배열,

        System.out.println("초기 : \n" + Arrays.toString(range));
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 1 + 100;
            int end = lines[i][1] + 100;
            for (int j = start; j <= end; j++) {
                range[j]++;
            }
        }
        // 겹치는 부분 길이 계산
        for (int i = 0; i < range.length; i++) {
            if (range[i] > 1) answer++;
        }
        System.out.println(Arrays.toString(range));

        return answer;
    }

    public static void main(String[] args) {
        int[][] lines = new int[][] {{1, 2}, {2, 3}, {3, 4}};
        System.out.println("[ result ] : " + solution(lines));
    }

}
