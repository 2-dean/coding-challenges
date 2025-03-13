package org.programmers.level1;


import java.util.ArrayList;
import java.util.List;

public class nextBlock {
    /*
    이웃한 칸들 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확인하는 과정은 다음과 같습니다.
    1. 정수를 저장할 변수 n을 만들고 board의 길이를 저장합니다.
    2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
    3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
    4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
        4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
        4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
            4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
    5. count의 값을 return합니다.
     */

    public static int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        List<Integer> dh = List.of(0, 1, -1, 0);
        List<Integer> dw = List.of(1, 0, 0, -1);
        int[][] arr  = new int[n][n];

        for (int i = 0; i < 4; i++) { // 0~3 네방향 탐색
            int h_check = h + dh.get(i);
            int w_check = w + dw.get(i);

            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}
                           ,{"red", "red", "blue", "orange"}
                           , {"blue", "orange", "red", "red"}
                           , {"orange", "orange", "red", "blue"}};
        solution(board, 1, 1);
    }

}
