package org.boj.part1;

import java.util.Scanner;

public class Main_11005 {

    public static void main(String[] args) {
//        진법 변환
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int formation = sc.nextInt();

        String string = Integer.toString(number, formation);
        System.out.println(string.toUpperCase());

    }
}
