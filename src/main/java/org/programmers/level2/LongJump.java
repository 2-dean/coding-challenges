package org.programmers.level2;

public class LongJump {
    public static long solution(int n) {
        // 피보나치 수열과 동일
        // f(n) = f(n-1) + f(n-2)
        // 재귀는 비효율적임
        int[] fibo = new int[n + 2];
        fibo[1] = 1;
        fibo[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }

        return fibo[n];
    }

    public static void main(String[] args) {
        solution(5);
    }

}

