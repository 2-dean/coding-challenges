package org.programmers.introdution.day22;

public class Q22_4 {

    /**
     *  문제 : 유한소수 판별하기
     *
     *  소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
     *  분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
     *
     * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
     * 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
     *
     *
     */
    public static int solution(int a, int b) {
        int answer = 0;

        // a/b -?> b가 분모

        // 약분하기 -> 최대공약수 찾기
        int commonDiv = 0;
        for (int i = 1; i<= a && i<= b; i++) {
            if (a%i == 0 && b%i==0){
                commonDiv = i;
            }
        }

        if (commonDiv != 0) {
            a /= commonDiv;
            b /= commonDiv;
        }

        // 분모의 소인수가 2와 5만 존재
        //int k = 2; // 소인수

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }
        if (b == 1) {
            answer = 1;
        } else {
            answer = 2;

        }






        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + solution(7, 20));
    }

}
