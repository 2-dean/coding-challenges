package org.day14;

public class Question14_5 {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4};
        int[][] queries = {{0,1},{1,2},{2,3}};

        int[] result = solution(numbers, queries);
        System.out.println("result : " + result);
//        for(int num : result) {
//            System.out.println("√num : " + num);
//        }
    }



    public static int[] solution(int[] arr, int[][] queries) {

        int num1 = 0;
        int num2 = 0;

        for (int i=0; i<queries.length; i++){
            num1 = queries[i][0];
            num2 = queries[i][1];

            // num1부터 num2까지의 모든 원소에 1을 더함
            for (int j = num1; j <= num2; j++) {
                arr[j] += 1;
            }
            System.out.println("arr["+num1+"] : " + arr[num1] + ", arr["+num2+"] : " + arr[num2]);
        }

        return arr;
    }



} //class
