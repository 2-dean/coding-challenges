package org.programmers.level2;

import java.util.Arrays;

public class MaxMin {

    public static String solution(String s) {

        String[] arr = s.split(" ");
/*        int[]  nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];*/

        int max = Integer.MIN_VALUE; // 제일 작은 수를 저장
        int min = Integer.MAX_VALUE; // 제일 큰 수를 저장

        for (String num : arr) {
            int n = Integer.parseInt(num);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        String answer = min + " " + max;


        return answer;
    }

    public static void main(String[] args) {
        solution("1 2 3 4");
    }

}
