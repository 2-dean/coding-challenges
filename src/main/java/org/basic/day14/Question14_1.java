package org.basic.day14;

public class Question14_1 {

    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6}; //{5, 2, 1, 7, 5}
        int n = 1;

        int result = solution(num_list);
        System.out.println("result : " + result);
//        for(int num : result) {
//            System.out.println("√num : " + num);
//        }
    }



    public static int solution(int[] num_list) {

        int oddSum = 0;
        int evenSum = 0;

        // index 0 = 1 번원소 , 홀수번째 원소 0,2,4 n-1
        for (int i=0; i<num_list.length; i++){
            if (i%2 == 0){
            // 홀수번째 원소들의 합
                oddSum += num_list[i];
            } else {
            // 짝수번째 원소들의 합
                evenSum += num_list[i];
            }
        }

        // 비교하여 return
        if (oddSum == evenSum || oddSum > evenSum){
            return oddSum;
        } else {
            return evenSum;
        }

    }



} //class
