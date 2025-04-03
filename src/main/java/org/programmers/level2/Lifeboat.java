package org.programmers.level2;

import java.util.Arrays;

public class Lifeboat {
    public static int solution(int[] people, int limit) {
        // 몸무게 많이나가는 사람 > limit /2 면 한명만 태움
        // limit/2 보다 같거나 작으면 몸무게 적은사람 태워봄


        /*
        "가장 무거운 사람과 가벼운 사람을 짝짓는 방식" 을 생각하면 쉬움!
        ㅎㄱㄷㄷ요 qkd

         */

        int answer = 0;
        Arrays.sort(people);

        int i = 0;  //가장 가벼운 사람
        int j = people.length - 1; // 가장무거운사람
        while (i <= j) {
            if (people[i] + people[j] <= limit) { // 같이 탈 수 있는경우에 태움
                i++; // 가벼운사람태움
            }
            j--; // 무거운 사람 태움 (무조건 태워야하니깐ㅋ)

            answer++;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[] {70, 50, 80, 50, 190, 44}, 190);

    }
}
