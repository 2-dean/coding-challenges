package org.programmers.level1;

import java.util.Arrays;

public class Bandaging {
    //붕대감기

    // t 초동안 붕대감으면서 1초마다 x만큼 체력회복
    // t초 동안 연속으로 감는데 성공하면 y만큼 체력 추가 회복
    // 최대체력 보다 커질 순 없음ㅋ


    // 기술 쓰는중 공격당하면 기술 취소, 당하는 중 체력회복 불가
    // 기술이 취소 되거나 끝나면 붕대감기 사용 -> 연속시간 0 으로 초기화
    // 체력 0 이하 > 죽음
    //
    public static int solution(int[] bandage, int health, int[][] attacks) {

        int nowHp = health; // 현재체력
        int bandagingSuccess = 0; // 연속성공

        int bandagingTime = bandage[0]; // 붕대감기 시간
        int recovery = bandage[1]; // 회복력
        int addRecovery = bandage[2]; // 추가회복

        int attackIdx = 0; //공격리스트에서 현재공격 인덱스
        int endTime = attacks[attacks.length-1][0]; // 마지막공격시간


        for (int i = 0; i <= endTime; i++) {
            if (attackIdx < attacks.length && i == attacks[attackIdx][0]){
                nowHp -=  attacks[attackIdx][1]; //피해적용
                bandagingSuccess = 0; // 초기화
                attackIdx++;

            } else {
                //붕대감기성공
                bandagingSuccess++;
                nowHp += recovery;
                if (bandagingSuccess == bandagingTime) {
                    nowHp += addRecovery;//추가회복
                    bandagingSuccess = 0; // ㅊ초기화
                }
                nowHp = Math.min(nowHp, health); // 최대체력초과방지

            }
            if (nowHp <= 0) {
                return -1;
            }

        }


        return nowHp;
    }

    public static void main(String[] args) {
                //시전시간, 초당회복력, 추가회복량 / 최대체력 / 공격시간, 피해량
        solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10},{9, 15},{10, 5},{11, 5}});
    }
}
