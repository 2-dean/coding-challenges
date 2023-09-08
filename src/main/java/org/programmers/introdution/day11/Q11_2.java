package org.programmers.introdution.day11;

public class Q11_2 {

    /**
     *  문제 :
     *  약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
     *  자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int n) {
        int answer = 0;
        // 약수의 갯수
        for (int i = 1; i <= n; ++i){
            //if 합성수면 answer++  아니면 넘어감
            // 합성수?
            int count = 0;
            for(int j= 1; j<=i; ++j) {
                if(i % j == 0) {
                    // 약수 여부를 판단
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(10));
    }

}
