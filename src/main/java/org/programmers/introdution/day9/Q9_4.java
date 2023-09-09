package org.programmers.introdution.day9;

public class Q9_4 {

    /**
     *  문제 :
     *  머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
     *  머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
     *  balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
     */

    /**
     * 서로 다른 n개중에 r개를 선택하는 경우의 수를 의미합니다.
     *
     * 이 때, 조합은 뽑는 순서가 중요하지 않습니다!
     * @param n
     * @return
     */

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }



    public static long solution(int balls, int share) {
        long answer = 0;
        answer = factorial(balls) / factorial(balls) / (factorial(balls-share) * factorial(share));
        if(share > balls) {
            answer = 1;
        } else {
            answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        }
        return answer;
    }

    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        solution(balls, share);
    }

}
