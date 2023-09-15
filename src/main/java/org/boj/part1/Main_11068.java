package org.boj.part1;

import java.util.Scanner;

/*
    * 문제 : 11068 회문인 수
    *
    * - 이 수가 어떤 B진법 (2 ≤ B ≤ 64)으로 표현하면 회문이 되는 경우가 있는지 알려주는 프로그램을 작성
    *
    * -  테스트 데이터는 64 이상 1,000,000 이하인 하나의 정수로 주어진다.
    * */
public class Main_11068 {
    // 1. 가능한 모든 진법에대하여 진법을 변환한다

    // 2. 변환된 수가 회문이 될 수 있는지 확인한다.
        // 가운데를 기점으로 대칭되는 index가 같은지 확인


    public static int[] convertBase(int x, int B) {
        int len = 0, copyX = x;
        while (x > 0) {
            copyX /= B;
            len++;
        }
        int[] digit = new int[len];
        len = 0;
        while (x > 0) {
            digit[len++] = x % B;
            x = x / B;
        }

        return digit;
    }


    public static boolean isPalindrome(int[] digit) {
        for (int i = 0; i< digit.length/2; i++) {
            if (digit[i] != digit[digit.length - i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            boolean ans = false;
            for (int i = 2; i <= 64; i++) { // i 진법
                int[] digit = convertBase(x, i);
                if (isPalindrome(digit)) {
                    //회문이 되는 베열인 경우
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "1" : "0");
        }

    }



}
