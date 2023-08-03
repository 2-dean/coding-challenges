package org.day14;

public class Question14_4 {

    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34}; //{5, 2, 1, 7, 5}
        int n = 123;

        int result = solution(numbers, n);
        System.out.println("result : " + result);
//        for(int num : result) {
//            System.out.println("√num : " + num);
//        }
    }



    public static int solution(int[] numbers, int n) {

        int sum = 0;

        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
            if (sum > n){
                break;
            }
        }

        return sum;
    }



} //class
