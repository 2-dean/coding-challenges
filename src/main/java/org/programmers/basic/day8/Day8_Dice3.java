package org.programmers.basic.day8;

import java.util.Arrays;

public class Day8_Dice3 {
    static int solution(int a, int b, int c, int d) {
 /*       int answer = 0;
        int [] nums = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        int p = 0;
        int q = 0;
        int r = 0;

        Arrays.sort(nums); // 오름차순정렬


        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        if (map.size() == 1) {
            int point = nums[0] * 1111;
            answer =point;
        } else if (map.size() == 2) {
            //세 주사위에서 나온 숫자가 p로 같고
            //나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점
            for (int num : nums) {
                if (map.get(num) == 3) {
                    p = num;

                    if (map.get(num) == 1) {
                        q = num;
                    }
                    answer = (int) Math.pow((10 * p + q), 2);
                    break;
                }
                if (map.get(num) == 2 ) {
                    //(p + q) × |p - q|
                    p = num;
                    q = nums[2];
                    answer = (p + q) * (p - q);
                    break;
                }
            }

        } else if (map.size() == 3) {
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
                if (q != r)  answer = q * r;
                break;
            }

        } else if (map.size() == 4) {
            //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻음
            Arrays.sort(nums);
            answer = nums[0];
        }
        return answer;*/
        int answer = 0;
        int[] nums=new int[4];
        nums[0]=a;
        nums[1]=b;
        nums[2]=c;
        nums[3]=d;

        int multi=1;

        Arrays.sort(nums);//오름차순 정렬
        int[] dice=new int[6];
        for(int i=0;i<4;i++){
            dice[nums[i]-1]++;
        }

        for(int i=0;i<6;i++){
            if(dice[i]==4){
                answer=1111*(i+1);
                break;
            }
            else if(dice[i]==3){
                for(int j=0;j<6;j++){
                    if(dice[j]==1){
                        answer=(10*(i+1)+(j+1))*(10*(i+1)+(j+1));
                        break;
                    }
                }
            }
            else if(dice[i]==2){
                for(int j=0;j<6;j++){
                    if(dice[j]==2){
                        if(i==j){
                            continue;
                        }
                        else{
                            answer=(i+1+j+1)*((i+1)-(j+1));
                            break;
                        }

                    }
                    else if(dice[j]==1){
                        multi=multi*(j+1);
                    }
                }
                if(multi!=1){
                    answer=multi;
                }
            }
            if(nums[0]!=nums[1] && nums[1]!=nums[2] && nums[2]!=nums[3]){
                answer=nums[0];
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        //int[] arr = {0, 1, 2, 4, 3};
        //int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
        int[] arr = {3,3,3,2,2,4};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        int result = solution(4,1,4,4);
        System.out.println("result : " + result);
    }
}