package org.programmers.introdution.day21;

public class Q21_3 {

    /**
     *  문제 :삼각형의 완성조건 (2)
     *
     *  선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
     *
     * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
     * 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
     * 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
     *
     */
    public static int solution(int[] sides) {
        int answer = 0;

        int maxSide = Math.max(sides[0],sides[1]);
        int minSide = Math.min(sides[0],sides[1]);

        // 주어진 변중 하나가 제일 긴 변인 경우
        // 될수 있는 나머지변 max - min + 1 ~ max
        for (int i = maxSide - minSide + 1; i <= maxSide; i++) {
            answer++;
        }


        // 나머지 한 변이 가장긴 변인 경우
        // max + 1 ~ max+min -1
        for (int i = maxSide + 1; i <= maxSide + minSide -1 ; i++) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(new int[]{11, 7}));
    }

}
