package org.programmers.level2;

import java.util.Arrays;

public class MaxMin {

    public static String solution(String s) {

        String[] arr = s.split(" ");
        int[]  nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];


        String answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        solution("1 2 3 4");
    }

}
