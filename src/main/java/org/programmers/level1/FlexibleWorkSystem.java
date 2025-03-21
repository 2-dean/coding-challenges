package org.programmers.level1;

public class FlexibleWorkSystem {
    // 유연근무제
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // 금 토 일 월 화 수 목
        // 제외할 인덱스 값을 정함!
        int [] days = new int[7];
        days[0] = startday;
        for (int i = 1; i < days.length; i++) {
            if (startday + i <= 7 ){
                days[i] = startday + i;
            }
        }

        int satIdx = -1;
        int sunIdx = -1;

        for (int i = 0; i < 7; i++) {

            if (days[i] == 0 && i >= 1 && days[i-1] == 7) {
                days[i] = 1;
            }
            if (days[i] == 0) {
                days[i] = days[i-1] + 1;
            }
            if (days[i] == 6) {
                satIdx = i;
            }
            if (days[i] == 7) {
                sunIdx = i;
            }
        }

        //  출근 희망 시각 + 10 분 으로 셋팅
        for (int i = 0; i < schedules.length; i++) {
            //다음 시간으로 넘어가는지 확인 /% 100을 하면 100으로 나눈 나머지가 남아서 56이 나와!
            int hour = schedules[i]/100;
            int minute = schedules[i]%100 + 10;
            if (minute >= 60) {
                //시간 넘어가면
                hour += 1;
                minute = minute - 60;
                //150 > 200 // ++1 , +10 == 60이면 00
                //159 > 209  // ++1, 59+10 = 69 - 60 // 나머지인 9분 저장
            }
            schedules[i] = hour*100 + minute;
        }


        for (int i = 0; i < timelogs.length; i++) {
            int check = 0; // 지각횟수 체크
            for(int j = 0; j < timelogs[i].length; j++) {
                // j가 토/ 일이면 체크 안함
                if (j != satIdx && j != sunIdx) {
                    if (schedules[i] < timelogs[i][j]) {
                        check++;// 지각여부체크
                    }

                }
            }
            if (check > 0) answer++;
        }
        answer = schedules.length - answer;

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{700, 800, 1100}
                , new int[][]{{710, 2359, 1050, 700, 650, 631, 659},{800, 801, 805, 800, 759, 810, 809},{1105, 1001, 1002, 600, 1059, 1001, 1100}}
                , 5);
    }

}
