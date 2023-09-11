package org.baekjoon.part1;

import java.util.Scanner;

public class Main_10158 {
    // 개미
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String widthAndHeight = sc.nextLine();  // 격자크기
        String pCommaQ = sc.nextLine();         // 출발위치
        int time = sc.nextInt();                // 이동시간

        String[] widthAndHeightArr = widthAndHeight.split(" ");
        String[] pCommaQtArr = pCommaQ.split(" ");

        int width = Integer.parseInt(widthAndHeightArr[0]);
        int height = Integer.parseInt(widthAndHeightArr[1]);

        int p = Integer.parseInt(pCommaQtArr[0]);
        int q = Integer.parseInt(pCommaQtArr[1]);

        int count = 0;
        System.out.printf("before : %d, %d", p ,q);
        System.out.println("----------------");
        while (count <= 8) {
            count ++;
            // p+1, q+1 이 각각 w, h 보다 작거나 같으면 거기로 이동 +1
            // p+1 은 w 보다 작고, q+1은 h 보다 큰경우
            // q+1 은 h 보다 작고, p+1은 w 보다 큰경우
            // p+1, q+1 이 각각 w, h 보다 커지면 p-1, q-1로 이동
            if (p+1 <= width) {
                p += 1;
            }
            if ( q+1 <= height) {
                q += 1;
            }

            if (p+1 > width || q+1 > height){
                p -= 1;
                q -= 1;
            }
            System.out.printf("\nmoving : %d, %d", p ,q);

        }
        System.out.println("----------------");
        System.out.printf("\nafter : %d, %d", p ,q);
    }
}
