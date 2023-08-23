package org.programmers.introdution.day2;

public class Q2_4 {

    public static int[] solution(int[] numbers) {

//        int[] answer = {};
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = numbers[i]*2;
        }
        return numbers;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int[] result = solution(numbers);
        for(int num : result){
            System.out.println(num);
        }
    }

}
