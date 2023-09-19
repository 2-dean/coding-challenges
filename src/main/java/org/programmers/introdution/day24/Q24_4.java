package org.programmers.introdution.day24;

public class Q24_4 {

    /**
     *  문제 :k의 개수
     *
     *  1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
     *  정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
     *
     */
    public static int solution(int i, int j, int k) {
        int answer = 0;
        // i~j 까지 k가 몇번 등장?

        for (int n = i; n <= j; n++) {
            char[] numberArr = String.valueOf(n).toCharArray();
            String findNum = String.valueOf(k);


            for (int m = 0; m < numberArr.length; m++){
                if (numberArr[m] == findNum.charAt(0)) {
                    answer++;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + solution(1, 13, 1));
    }

}
