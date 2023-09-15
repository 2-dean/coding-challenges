package org.programmers.introdution.day18;

public class Q18_3 {

    /**
     *  문제 :세균증식
     *
     *  어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
     *  처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int n, int t) {
        int answer = 0;
        while (t-- > 0) {
            n *= 2;
        }
        answer = n;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(7, 15));
    }

}
