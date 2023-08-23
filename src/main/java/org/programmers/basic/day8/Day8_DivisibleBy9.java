package org.programmers.basic.day8;

public class Day8_DivisibleBy9 {
    static int solution(String number) {
        char[] stringNumArr = number.toCharArray();
        int num = 0;

        for (char charNum : stringNumArr) {
            num += Integer.parseInt(String.valueOf(charNum));
        }

        return num % 9;

    }


    public static void main(String[] args) {
        String number = "78720646226947352489";
        int result = solution(number);

        System.out.println("[ result ] : " + result);
    }
}
