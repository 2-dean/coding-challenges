package org.baekjoon.part1;

public class Main_1543 {
    /*
    * 문제 : 문서 검색
    * 세준이는 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 한다.
    * 이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다.
    * 그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다.
    * 예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면,
    * 세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다. 그러나 동시에 셀 수는 없다.
    세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.
     * */
    public static String solution(String start , String saltDownTime) {
        String answer = "";
        int hh = 0;
        int mm = 0;
        int ss = 0;


        int startHh = Integer.parseInt(start.substring(0, 2));
        int startMm = Integer.parseInt(start.substring(3, 5));
        int startSs = Integer.parseInt(start.substring(6));

        int saltDownHh = Integer.parseInt(saltDownTime.substring(0, 2));
        int saltDownMm = Integer.parseInt(saltDownTime.substring(3, 5));
        int saltDownSs = Integer.parseInt(saltDownTime.substring(6));

        if((startSs + saltDownSs) > 59 ) {
            ss = startSs + saltDownSs - 60;
            mm += 1;
        } else {
            ss = startSs + saltDownSs;
        }

        if (startMm + saltDownMm > 59) {
            mm = startMm + saltDownMm - 60;
            hh += 1;
        } else {
            mm = startMm + saltDownMm;
        }
        if (startHh + saltDownHh > 23) {
            hh = startMm + saltDownMm - 24;
            hh += 1;
        } else {
            mm = startMm + saltDownMm;
        }
        hh = startHh + saltDownHh;

        answer = hh + ":"+ mm + ":" + ss;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("12:34:56",  "14:36:22"));
    }
}
