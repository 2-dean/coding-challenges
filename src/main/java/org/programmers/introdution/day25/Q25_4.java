package org.programmers.introdution.day25;

public class Q25_4 {

    /**
     *  문제 :다음에 올 숫자
     *
     *  등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
     */
    public static int solution(int[] common) {
        int answer = 0;

        int diff = 0;
        // 등차수열, 등비수열인지 구분
//        int diff1 = common[1] - common[0];
//        int diff2 = common[common.length-1] - common[common.length-2];

//        int diff3 = common[1] / common[0];
//        int diff4 = common[common.length-1] / common[common.length-2];
        if (common[1] - common[0] == common[common.length-1] - common[common.length-2]) {
            System.out.println("등차수열");
            diff = common[1] - common[0];
            answer = common[common.length-1] + diff;
        } else if(common[1] / common[0] == common[common.length-1] / common[common.length-2]) {
            System.out.println("등비수열");
            diff = common[1] / common[0];
            answer = common[common.length-1] * diff;
        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] :" + solution(new int[]{2, 4, 8}));
    }

}
