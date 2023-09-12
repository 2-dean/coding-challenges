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

        int currentX = Integer.parseInt(pCommaQtArr[0]);
        int currentY = Integer.parseInt(pCommaQtArr[1]);

        int deltaX = 1;
        int deltaY = 1;

        int timeX = time % (2 * width);
        int timeY = time % (2 * height);

        while (timeX-- > 0) {
            if (currentX == width){
                deltaX = -1;
            } else if (currentX == 0){
                deltaX = 1;
            }
            currentX += deltaX;
        }

        while (timeY-- > 0) {
            if (currentY == width){
                deltaY = -1;
            } else if (currentY == 0) {
                deltaY = 1;
            }
            currentY += deltaY;
        }
        System.out.println("\n----------------");
        System.out.printf("\nafter : %d, %d", currentX ,currentY);
    }
}
