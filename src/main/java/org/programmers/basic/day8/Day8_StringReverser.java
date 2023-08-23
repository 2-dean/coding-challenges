package org.programmers.basic.day8;

public class Day8_StringReverser {

    static String solution(String my_string, int[][] queries) {
        String answer = "";

        char[] charArr = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;

                start++;
                end--;
            }

        }

        return new String(charArr);
    }


    public static void main(String[] args) {

        String my_string = "rermgorpsam";
        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
        String result = solution(my_string, queries);

        System.out.println("[ result ] : "+ result);
    }
}
