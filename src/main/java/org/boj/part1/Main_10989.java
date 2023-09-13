package org.boj.part1;

import java.io.*;

public class Main_10989 {
     /*
     * 문제 :수 정렬하기 3
     * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
     *
     * 입력 :
     * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
     * 이 수는 10,000보다 작거나 같은 자연수이다.
     *
     *
     *  */
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        // 숫자의 count[] 을 만듦

        // 계산된 복잡도가 실제 실행수행시간은 아님! Scanner 와 System.out.print 계열 함수는 상대적으로 느림
        // BufferedReader 와 BufferdWriter 를 사용할 수 있음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 한줄씩 읽게됨
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // br.readLine();
        // bw.write();
        // bw.flush(); // 출력됨


        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10_001]; // 0번 인덱스에는 안들어감
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++; // 입력받은 숫자가 해당 인덱스 번호에 들어감
        }
        for(int i = 1; i <= 10_000; i++) {
            while(cnt[i]-- >0) {
                bw.write(i + "\n"); // 오름차순으로 출력
            }
            bw.flush();;
        }


/*      ## 시간초과

        int range = sc.nextInt();
        int[] numbers = new int[range];

        for (int i = 0; i < numbers.length; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }
        // 정렬
        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/


    }
}
