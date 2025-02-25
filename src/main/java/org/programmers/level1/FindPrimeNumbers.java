package org.programmers.level1;

public class FindPrimeNumbers {
    /*
    문제 :

     1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

     소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
     (1은 소수가 아닙니다.)

     제한 조건
     n은 2이상 1000000이하의 자연수입니다.
     */

    // <에라토스테네스의 체> 방법으로 풀이
    // 2부터 시작하여 특정수의 배수를 지우면서 소수만 남기는 방식
    public static int solution(int n) {
        Boolean[] isPrime = new Boolean[n + 1]; // 소수 판별 배열
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // 처음에는 모두 소수로 가정
        }

        for (int i = 2; i * i <= n; i++) { // i ≤ √n 까지만 검사
            if(isPrime[i]){ //i가 소수라면
                for (int j = i * i; j <= n; j += i) { // i의 배수를 모두제거
                    isPrime[j] = false;
                }
            }

        }

        int count = 0;
        for (int i = 2; i <= n; i++) { // 남아있는 소수 개수 세기
            if(isPrime[i]) count++;
        }

        return count;

    }


    public static void main(String[] args) {
        solution(10);
    }
}
