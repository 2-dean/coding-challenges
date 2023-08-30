package org.programmers.introdution.day10;

public class Q10_3 {

    /**
     *  문제 :
     *  머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
     *  공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
     *  친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
     *  k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<k; i++){
            System.out.println("count : " +(i+1) + " 번째");
            answer = numbers[count];
            count +=2;
            System.out.println("index : " + count  + ", 던지는 사람 : " + answer);
            //if(k % 2 == 0 &&  count > numbers.length-1)  count=0;
            //if(k % 2 != 0 && count > numbers.length-1) count = 1;
            if(count > numbers.length-1) count = 1;
            if(numbers.length <= k && count > numbers.length-1) count = 1;
        }

        return answer;
    }



    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(num_list, 5));
    }

}
