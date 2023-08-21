package org.introdution.day5;

public class Q5_2 {

    /**
     *  문제 :
     머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
     머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
     머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static  int[] solution(int money) {
        int[] answer = new int[2];

        if (money < 5500){
            answer[0] = 0;
            answer[1] = money;
        } else {
            answer[0] = money/5500; // 개수
            answer[1] = money%5500; // 가격
        }
//        int coffee = 5_500;
//
//        while (money >= 5_500) {
//            money -= 5_500;
//            if (money < 5_500) break;
//            coffee += 5_500;
//        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(15_000);
        System.out.println("result = " + result);
    }

}
