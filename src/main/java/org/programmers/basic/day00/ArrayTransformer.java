package org.programmers.basic.day00;

public class ArrayTransformer {

    static int[] solution(int[] arr, int k) {
        int[] answer = arr.clone();

        for (int i=0; i< arr.length; i++){
            if(k%2 !=0) {
                System.out.println("홀수");

                answer[i] = arr[i] * k;
            } else  {
                System.out.println("짝수");
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }




    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 100, 99, 98};
        int[] result = solution(num_list, 2);

        System.out.println("-- result --");
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
