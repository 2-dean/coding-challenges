package org.programmers.level1;


import java.util.Arrays;

//예산
// 최대한 많은부서에 지원
public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;

        // 신청금액 오름차순 정렬
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for (int department : d) {
            if (department > budget) {break;}
            // 예산에서 깎기
            budget -= department;
            answer ++;
            System.out.println("department = " + department + ", budget = " + budget);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 3, 2, 5, 4}, 9);
    }

}
