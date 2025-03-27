package org.programmers.level1;

//1, 7, 10
public class VideoPlayer {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 동영상 길이 : video_len
        // 기능 수행직전 재생위치 : pos
        // 오프닝 시작시각 : op_start
        // 오프닝 끝 : op_end
        // 사용자 입력 : commands
        // prev : -10초, 남은 시간10초 미만일경우 0dmfh
        // next:  +10초, 남은시간 10초미만 일경우 영상의 끝으로
        // 옾닝 건너뛰기 : 오프닝 중간에 있을때는 next 하면   d오프닝끝나는 위치로
        //사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return
        String answer = "";

        String[] video_len_arr = video_len.split(":");
        String[] pos_arr = pos.split(":");
        String[] op_start_arr = op_start.split(":");
        String[] op_end_arr = op_end.split(":");

        int videoLen = Integer.parseInt(video_len_arr[0]) * 60 + Integer.parseInt(video_len_arr[1]);
        int posLen = Integer.parseInt(pos_arr[0]) * 60 + Integer.parseInt(pos_arr[1]);
        int opStart = Integer.parseInt(op_start_arr[0]) * 60 + Integer.parseInt(op_start_arr[1]);
        int opEnd = Integer.parseInt(op_end_arr[0]) * 60 + Integer.parseInt(op_end_arr[1]);

        for (int i = 0; i < commands.length; i++) {
            // 오프닝 구간인지 확인
            if (opStart <= posLen && posLen <= opEnd) {
                System.out.println("오프닝구간임 >> ");
                posLen = opEnd;
            }
            // next ->
            if (commands[i].equals("next")) {
                //
                if (posLen + 10 <= videoLen) {
                    posLen += 10;
                } else {
                    posLen = videoLen; // 넘으면 전체길이
                }
            }
            if (commands[i].equals("prev")){
                // prev -> 0보다 작아지는 지 확인, 0,또는 -10
                if (posLen - 10 <= 0) {
                    posLen = 0;
                } else {
                    posLen -= 10;
                }
            }
            // next, prev 하고 오프닝 구간에 들어가면 오프닝 끝으로 보내기
            if (opStart <= posLen && posLen <= opEnd) {
                posLen = opEnd;
            }

        }

        if (opStart <= posLen && posLen <= opEnd) {
            posLen = opEnd;
        }


        String minute = Integer.toString(posLen / 60);
        String second = Integer.toString(posLen % 60);
        if (minute.length() == 1) {
            minute = "0" + minute;
        }
        if (second.length() == 1) {
            second = "0" + second;
        }
        if (posLen % 60 == 0) {
            second = "00";
        }
        answer = minute + ":" + second;

        return answer;
    }

    public static void main(String[] args) {


     //   solution(  "30:01", "29:55", "01:00", "01:30", new String[]{"next"});
        solution(  "10:00", "00:03", "00:00", "00:05", new String[]{"prev", "next"});
        solution(  "10:55", "00:16", "00:15", "00:17", new String[]{"prev"});
        solution( "59:59", "59:45", "00:00", "01:00",  new String[]{"next"});
        solution(  "30:00", "01:05", "01:00", "01:30",  new String[]{"prev"});
    }
}
