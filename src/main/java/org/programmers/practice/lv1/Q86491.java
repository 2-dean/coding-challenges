package org.programmers.practice.lv1;

import io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator;

public class Q86491 {

    /**
     *  문제 :최소직사각형
     */
    public static int solution(int[][] sizes) {
        int answer = 0;

        // 회전 가능하므로 가로세로 구분 없이 긴것의 최대, 짧은것의 최대 구하기

        int maxLong = 0;
        int maxShort = 0;

        int logger = 0;
        int shorter = 0 ;

        for (int i = 0; i < sizes.length; i++) {
            logger = Math.max(sizes[i][0], sizes[i][1]);
            shorter = Math.min(sizes[i][0], sizes[i][1]);

            if (logger > maxLong) maxLong = logger;
            if (shorter > maxShort) maxShort = shorter;
        }
        answer = maxLong * maxShort;
        return answer;
    }

    public static void main(String[] args) {

    }

}
