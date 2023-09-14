package org.programmers.introdution.day16;

public class Q16_4 {

    /**
     *  문제 : 배열의 유사도
     *  두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++){
                if (s1[i].equals(s2[j])) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println("result : " + solution(s1, s2));
    }

}
