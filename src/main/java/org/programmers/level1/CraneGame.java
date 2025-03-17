package org.programmers.level1;

import java.util.Stack;

public class CraneGame {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        // board 에서 제일 뒤에꺼부터 넣기
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            // 크레인이 해당 열에서 인형을 뽑을 위치 찾기
            for (int i = 0; i < board.length; i++) {
                int current = board[i][move - 1]; // 해당열의 i번째 행
                System.out.println("board["+i+"]["+(move - 1)+"] : " + current);
                if (current != 0) { // 인형찾으면
                    board[i][move - 1] = 0; // 그 자리는 빈칸 처리
                    if (!basket.isEmpty() && basket.peek() == current) {
                        basket.pop();
                        answer += 2; //터진 인형2개
                    } else {
                        basket.push(current);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[][]{{0,0,0,0,0},
                            {0,0,1,0,3},
                            {0,2,5,0,1},
                            {4,2,4,4,2},
                            {3,5,1,3,1}},new int[]{1,5,3,5,1,2,1,4});
    }
}
