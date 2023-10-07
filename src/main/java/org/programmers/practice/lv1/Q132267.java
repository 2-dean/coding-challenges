package org.programmers.practice.lv1;

public class Q132267 {

    /**
     *  문제 :콜라 문제
     */
    public static int solution(int a, int b, int n) {
        int answer = 0;

        //b: a 병 주면 받을 수 있는 병
        // n 갖다줄 병

        // (n/a)*b =새로받은 콜라
        // n % a 바꾸고 남은 콜라
        // 새로남은 콜라 + 바꾸고 남은 콜라 =  현재 콜라
        // a 병 보다 적으면 더이상 못바꿈 -> 끝
        while (n>=a) { // 가지고있는 병의 수 n이 a보다 크고 같은동안
            answer += (n/a) * b; // a병을 가져가면 b 병 만큼 주니까
            n = (n/a)*b  + n % a; // 현재가진 병의 개수(n) 업데이트
        }


        return answer;

    }

    public static void main(String[] args) {
        solution(2,1,20);
    }

}
