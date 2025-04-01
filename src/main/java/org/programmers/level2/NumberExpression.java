package org.programmers.level2;


public class NumberExpression {

    public static int solution(int n) {
        int count = 0;
        for (int start = 1; start <= n; start++) {
            int sum = 0;
            for (int num = start; sum < n; num++) {
                sum += num;
                System.out.println(sum);
                if (sum == n) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solution(15);
    }
}
