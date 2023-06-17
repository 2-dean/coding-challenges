package org.day8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day8_Dice3 {
    static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] nums = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        int p = 0;
        int q = 0;
        int r = 0;

        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        System.out.println("map : " + map);

        if (map.size() == 1) {
            System.out.println("map size 1 ");
            int point = nums[0] * 1111;
            answer =point;

        } else if (map.size() == 2) {
            System.out.println("map size 2 ");
            //세 주사위에서 나온 숫자가 p로 같고
            //나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점
            for (int num : nums) {
                if(map.get(num) == 3 ) {
                    p =  num;
                } else if (map.get(num) == 1) {
                    q =  num;
                }
            }
            answer = (int) Math.pow((10 * p + q), 2);
            for (int num : nums) {
                if (map.get(num) == 2 && p == 0){
                    System.out.println("map size 2 -> 2:2 ");
                    //(p + q) × |p - q|
                    p = num;
                } else if (map.get(num) == 2 && num != p) {
                    q = num;
                }
            }
            System.out.println("p:"+p);
            System.out.println("q:"+q);
            answer = (p + q) * (p - q);
        } else if (map.size() == 3) {
            System.out.println("map size 3 ");
            //어느 두 주사위에서 나온 숫자가 p로 같고
            //나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
            for (int num : nums) {
                if (map.get(num) == 2){
                    p = num;
                } else if (map.get(num) == 1) {
                    q = num;
                    if (map.get(num) != q) {
                        r = num;
                    }
                }
            }
            if (q != r)  answer = q * r;
        } else if (map.size() == 4) {
            System.out.println("map size 4 ");
            //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻음
            Arrays.sort(nums);
            answer = nums[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        //int[] arr = {0, 1, 2, 4, 3};
        //int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
        int[] arr = {3,3,3,2,2,4};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        int result = solution(4,1,1,4);
        System.out.println("result : " + result);
    }
}