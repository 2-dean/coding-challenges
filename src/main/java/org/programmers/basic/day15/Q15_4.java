package org.programmers.basic.day15;

public class Q15_4 {

    /**
     *  문제 :길이에 따른 연산
     */
    public static int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11){
            // 모든 원소의 합을 리턴
            for(int i=0; i<num_list.length; i++) {
                answer+= num_list[i];
            }
        } else {
            //모든 원소의 곱을 리턴
            answer = 1;
            for(int i=0; i<num_list.length; i++) {
                answer *= num_list[i];
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
    }

}
