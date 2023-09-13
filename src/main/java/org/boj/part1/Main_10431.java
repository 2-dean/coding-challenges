package org.boj.part1;

import java.util.Scanner;

public class Main_10431 {
    /*
    * 문제 : 줄세우기
    * 우선 아무나 한 명을 뽑아 줄의 맨 앞에 세운다. 그리고 그 다음부터는 학생이 한 명씩 줄의 맨 뒤에 서면서 다음 과정을 거친다.

    자기 앞에 자기보다 키가 큰 학생이 없다면 그냥 그 자리에 서고 차례가 끝난다.
    자기 앞에 자기보다 키가 큰 학생이 한 명 이상 있다면 그중 가장 앞에 있는 학생(A)의 바로 앞에 선다.
    * 이때, A부터 그 뒤의 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러서게 된다.
    이 과정을 반복하면 결국 오름차순으로 줄을 설 수가 있다.

    아이들의 키가 주어지고, 어떤 순서로 아이들이 줄서기를 할 지 주어진다. 위의 방법을 마지막 학생까지 시행하여 줄서기가 끝났을 때 학생들이 총 몇 번 뒤로 물러서게 될까?
    *
    *  *** 테스트 케이스 문제 각 케이스별로 답을 출력해야함
    *
    * 시간 복잡도 O(P * N^2)
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        while (P-- > 0) {
            int T = sc.nextInt(); // 테스트 케이스 번호

            int[] h = new int[20]; // 학생들 키 를 담을 arr

            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }

            int cnt = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                //1. 줄 서있는 학생중에 자신보다 큰 학생을 찾는다.
                //1-1. 찾지 못했다면 줄의 가장 뒤에선다
                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if(sorted[j] > h[i]) {
                        //2. 찾았다면 그 학생의 앞에 선다
                        //3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        find = true;
                        for (int k = i-1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                    if (!find) sorted[i] = h[i];
                }
            }
            System.out.println(T +  "  " +cnt);
        }



    }
}
