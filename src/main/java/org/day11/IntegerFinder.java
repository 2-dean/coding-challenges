package org.day11;

public class IntegerFinder {

    static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int num :  num_list) {
           if( n == num) {
               answer = 1;
               break;
           } else {
               answer = 0;
           }
        }
        return answer;
    }




    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println("[ result ] : " +  solution(num_list, 3));
    }
}
