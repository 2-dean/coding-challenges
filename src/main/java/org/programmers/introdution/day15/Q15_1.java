package org.programmers.introdution.day15;

public class Q15_1 {

    /**
     *  문제 : 영어가 싫어요
     *  영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
     *  문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
     *
     * ** 제한사항
     *  numbers는 소문자로만 구성되어 있습니다.
     *  numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
     *  1 ≤ numbers의 길이 ≤ 50
     *  "zero"는 numbers의 맨 앞에 올 수 없습니다
     */
    public static long solution(String numbers) {

        // 문자열 에서 "one" = 1, "two" = 2 이면 각각 대응 되는 숫자를 answer에 저장
        // one 이 있으면 그 문자열 길이만큼 자르기?
        // -> 문자열 치환

        String  stringNumbers = numbers
                                .replace("zero", "0")
                                .replace("one", "1")
                                .replace("two","2")
                                .replace("three", "3")
                                .replace("four", "4")
                                .replace("five", "5")
                                .replace("six", "6")
                                .replace("seven", "7")
                                .replace("eight", "8")
                                .replace("nine", "9");

        long answer = Long.parseLong(stringNumbers);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " +  solution("onefourzerosixseven"));
    }

}
