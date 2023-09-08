package org.programmers.introdution.day11;

public class Q11_3 {

    /**
     *  문제 :
     *  정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int[] numbers) {
        int answer = 0;
        int temp=0;
        int max=0;
        for (int i = 0; i < numbers.length; i++) {
            for(int j= 1; j < numbers.length-1; j++) {
                // if i인덱스랑 j인덱스 같으면 건너뜀
                if(i != j) {
                    temp = numbers[i] * numbers[j];
                }


                if(temp > max) {
                    max = temp;
                }
                System.out.println("max = " + max);
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int[] numbers = {0, 31, 31, 10, 1, 9};
        System.out.println(solution(numbers));
    }

}
