package org.programmers.practice.lv1;

/*
* [문제] 자릿수 더하기
* 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
* 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
*
* -N의 범위 : 100,000,000 이하의 자연수
 * */
public class Q12931 {
    public static int solution(int num) {
        int answer = 0;

        String numStr = String.valueOf(num);
        for (int i = 0;  i< numStr.length(); i++) {
           answer += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(123));
    }

}
