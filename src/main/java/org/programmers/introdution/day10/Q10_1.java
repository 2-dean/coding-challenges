package org.programmers.introdution.day10;

public class Q10_1 {

    /**
     *  문제 :
     *  x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
     *  좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요
     */
    public static int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if (x < 0) {
            if(y < 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if(y < 0) {
                answer = 4;
            } else {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] dot = {-7, 5};
        System.out.println(solution(dot) + "사분면");
    }

}
