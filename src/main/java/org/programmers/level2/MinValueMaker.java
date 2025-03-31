package org.programmers.level2;

import java.util.Arrays;

public class MinValueMaker {
    public static int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        //int j = A.length - 1;
        int length = A.length;
        for (int i = 0; i < A.length; i++) {
//            answer+= A[i] * B[j];
            answer += A[i] * B[length - 1 - i]; // B를 역순으로 곱함

          //  j--;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
    }
}
