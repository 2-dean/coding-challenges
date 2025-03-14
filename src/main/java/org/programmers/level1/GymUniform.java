package org.programmers.level1;

import java.util.Arrays;

public class GymUniform {
    /*
    점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
    다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
    학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
    예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
    체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
     */
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        boolean[] hasExtra = new boolean[n + 1]; //여벌체육복 여부
        boolean[] isLost = new boolean[n + 1];  //도난당한학생

        for (int r : reserve ) hasExtra[r] = true;
        for (int l : lost ) isLost[l] = true;

        // 여벌이 있는데 도난당한 경우 자기 체육복 사용
        for (int i = 1; i <= n; i++) {
            if (hasExtra[i] && isLost[i]) {
                hasExtra[i] = false;
                isLost[i] = false;
            }
        }

        // 체육복 빌려주기
        for (int i=1; i<=n; i++) {
            if (isLost[i]) { //
                if (i > 1 && hasExtra[i - 1]) { // 앞번호 사람한테빌림
                    hasExtra[i - 1] = false;
                    isLost[i] = false;
                } else if (i < n && hasExtra[i + 1]) {
                    hasExtra[i + 1] = false;
                    isLost[i] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if(!isLost[i]) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        solution(5, new int[] {2,4}, new int[] {1,3,5});
    }
}
