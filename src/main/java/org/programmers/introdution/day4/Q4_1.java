package org.programmers.introdution.day4;

public class Q4_1 {

    /**
     *  문제 :
     *  머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
     *  피자를 나눠먹을 사람의 수 n이 주어질 때,
     *  모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를
     *  return 하는 solution 함수를 완성해보세요.
     */
    public static int solution(int n) {
        // 7명미만, 7명, 7명 초과
        if (7 >= n) { // 7명 미만
            return 1;
        } else  { // 7명 초과
            int pizza = n/7;
            if (n%7 == 0){ // 77 명일때  11판
                return pizza;
            } else {
                return pizza + 1;
            }
        }
    }

    public static void main(String[] args) {

        int result = solution(77);
        System.out.println("result : " + result);
    }

}
