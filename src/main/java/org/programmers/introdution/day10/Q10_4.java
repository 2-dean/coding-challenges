package org.programmers.introdution.day10;

public class Q10_4 {

    /**
     *  문제 :
     *  정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
     *  배열 numbers의 원소를 direction 방향으로 한 칸씩 회전시킨
     *  배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for(int i = 0; i< numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
        } else {
            answer[numbers.length-1] = numbers[0];
            for(int i = 0; i< numbers.length-1; i++) {
                answer[i] = numbers[i+1];
                //0 , 1 /0+1
                //1 = 2 / 1+1
            }
        }
        return answer;

    }



    public static void main(String[] args) {
        int[] num_list = {1, 2, 3};
        String direction = "right";
        System.out.println(solution(num_list, direction));
    }

}
