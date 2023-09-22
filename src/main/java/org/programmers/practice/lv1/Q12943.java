package org.programmers.practice.lv1;

public class Q12943 {

    /**
     *  문제 :콜라츠 추측
     *
     *  
     */
    public static int solution(long num) {
        int count = 0;

        // 홀수,짝수 구분
        // 홀 짝에 따라 반복
        if (num == 1) {
            return count;
        }
        while (num != 1) {
            count++;
            if (num % 2 == 0){
                // 짝수
                num /= 2;
            } else {
                // 홀수
                num = num * 3 + 1;
            }

            // 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
            if (count == 500) {
                count = -1;
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        solution(626331);
    }

}
