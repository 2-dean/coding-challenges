package org.introdution.day6;

public class Q6_3 {

    /**
     *  문제 :
     *  정수가 담긴 리스트 num_list가 주어질 때,
     *  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
     *  return 하도록 solution 함수를 완성해보세요.
     */
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;  //홀
        int even = 0; //짝
        for (int num : num_list){
            if(num%2 !=0){
                odd++;
            } else {
                even++;
            }
        }

        answer[0] = even;
        answer[1] = odd;
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);

    }

}
