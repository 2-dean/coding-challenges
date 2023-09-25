package org.programmers.practice.lv1;

public class Q68935 {

    /**
     *  문제 :3진법 뒤집기
     *
     *  자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
     *  이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     *
     */
    public static  int solution(int n) {
        String third = "";
        while (n>0) {
            // n을 3으로 나누고 나머지를 저장!
             third += n % 3; // 삼진법 앞뒤 뒤집어서 저장됨 ;
             n /= 3; // 나눔
        }

        int num = 0;
        int power = 1; // 10의 거듭제곱을 나타내는 변수

        for (int i = third.length() - 1; i >= 0; i--) {
            int digit = third.charAt(i) - '0'; // 문자를 정수로 변환
            //   num += digit * Math.pow(3, i); // 3의 거듭제곱을 사용하여 10진수 변환
            num += digit * power;
            System.out.println("digit : " + digit + ", power :" + power);
            power *= 3; // 10의 거듭제곱을 업데이트
        }
        return num;
    }

    public static void main(String[] args) {
        solution(45);
    }

}
