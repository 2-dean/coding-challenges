package org.programmers.level2;

public class FibonacciSequence {
    public static int solution(int n) {
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
        }

        return fibo[n];
    }

    public static void main(String[] args) {
        solution(3);
    }
}
