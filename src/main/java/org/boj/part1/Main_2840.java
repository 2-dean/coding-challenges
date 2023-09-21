package org.boj.part1;

import java.util.Arrays;
import java.util.Scanner;

/*
* [2840] 행운의 바퀴
*
*
 * */
public class Main_2840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] wheel = new char[N];

        Arrays.fill(wheel, '?'); // 배열의 모든 값에 ?채움
        int curIndex = 0; // 화살표인덱스 저장

        // 입력된 순서로 값 찾기
        while (K-- > 0) {
            int step = sc.nextInt(); // 몇번 회전?
            char nextAlphabet = sc.next().charAt(0);

            // 자바음수는 음수값을 Modular 연산 하므롤~   N을 ㄷㅓ한후 N으로 나눠줌
            int nextIndex =((curIndex - step) % N + N) % N; //step 만큼 이동했을때 다음에 화살표가 가리키는 알파벳의 인덱스

            if (wheel[nextIndex] == '?') wheel[nextIndex] = nextAlphabet;
            else if (wheel[nextIndex] != nextAlphabet) {
                System.out.println("!");
                return;
            }
            curIndex = nextIndex;
        }

        boolean[] used = new boolean[26]; // 알파벳
        for (int i = 0; i < N; i++) {
            if (wheel[i] == '?') continue;
            if (used[wheel[i] - 'A']) {
                System.out.println("!");
                return;
            }
            used[wheel[i] - 'A'] = true;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(wheel[curIndex + i]);
            System.out.println();
        }

    }

}
