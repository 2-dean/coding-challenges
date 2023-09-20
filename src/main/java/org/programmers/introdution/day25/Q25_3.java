package org.programmers.introdution.day25;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Q25_3 {

    /**
     *  문제 :연속된 수의 합
     *
     *  연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
     *  두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total 이 될 때,
     *  정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
     *
     *  1부터 m까지의 자연수의 합을 구하는공식은 아래와 같습니다.
     * (n * (n + 1)) / 2 == total
     *
     * 자 그렇다면 도출해내야하는 리스트의 마지막 원소가 m일텐데 위 공식을 이용하여 아래와 같이 도출해낼수있습니다.
     * m == (((total * 2) / n) + n - 1) / 2
     * num이 홀수라면 mid보다 작은 수가 num/2개, num이 짝수라면 mid보다 작은 수가 num/2-1개.
     *
     */
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int middle = total / num - (num -1) /2; // 중간값
        for (int i = 0; i < num; i++) {
            answer[i] = middle + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + Arrays.toString(solution(3, 12)));
    }

}
