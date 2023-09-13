package org.boj.part1;

import java.util.Scanner;

public class Main_3273 {
    /*
    * - 문제 : 두 수의 합
    * n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
    * 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
    *
    * - 입력 :
    * 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
    *
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시간복잡도 O(N)풀이
        // 중복과 해당되지 않는 값은 삭제!

      /* 시간초과

        int arraySize = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비
        String numbers = sc.nextLine();
        int x = sc.nextInt();
        int count = 0;

        int[] array = new int[arraySize];
        String[] numberArr = numbers.split(" ");

        // 배열에 숫자 담기
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numberArr[i]);
        }
        // X 가 되는 수 count

        ### 시간복잡도 O(N^2) == 시간초과
        for (int i = 0; i < array.length; i++){
            for (int j = i+1 ; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    count++;
                }
            }
        }
        System.out.println(count);
*/

    }
}
