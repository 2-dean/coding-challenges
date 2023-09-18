package org.programmers.introdution.day19;

public class Q19_3 {

    /**
     *  문제 : 중복된 숫자 갯수
     *  정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int[] array, int n) {
        int answer = 0;
        //int[] numberCnt = new int[1000];

        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == n ) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] : "  + solution(new int[]{0, 2, 3, 4}, 1));
    }

}
