package org.programmers.introdution.day21;

public class Q21_2 {

    /**
     *  문제 : 안전지대
     */
    public static int solution(int[][] board) {
        int answer = 0;

        int size = board.length;

        // 위험지대 표시할 새로운 배열
        int[][] newBoard = new int[size][size];

        int n = 0, m = 0;
        for (int i = 0;  i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 1) {
                    danger(i,j, newBoard);
                }
            }
        }

        for (int i = 0;  i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[i].length; j++) {
                if (newBoard[i][j] == 0) {
                    answer++;
                }
            }
            System.out.println();
        }



        return answer;
    }

    static void danger(int i, int j, int[][] newBoard) {

        int overX = newBoard.length;
        int overY = newBoard[0].length;

        // 폭탄위치
        newBoard[i][j] = 1;

        // 위험지대 표시
        // 상
     /*   if (i+1 < height && j + 1 < width && j-1 > 0 ) {
            newBoard[i + 1][j - 1] = 1;
            newBoard[i + 1][j] = 1;
            newBoard[i + 1][j + 1] = 1;

            newBoard[i][j-1] = 1;
        }*/

        // 하
      /*  if (i-1 > 0 && j - 1 > 0 && j + 1 < width ) {
            newBoard[i-1][j-1] = 1;
            newBoard[i-1][j] =1;
            newBoard[i-1][j+1] = 1;

            newBoard[i][j+1] = 1;
        }*/
        // 좌, 우


        if(i > 0) newBoard[i-1][j] =1; // i-1 = 0표시가능
        if(i < overX-1) newBoard[i+1][j] =1; //
        if(j < overY-1) newBoard[i][j+1] =1;
        if(j > 0) newBoard[i][j-1] =1;
        if(i > 0 && j>0) newBoard[i-1][j-1] =1;
        if(i < overX-1 && j>0) newBoard[i+1][j-1] =1;
        if(i > 0 && j<overY-1) newBoard[i-1][j+1] =1;
        if(i < overX-1 && j<overY-1) newBoard[i+1][j+1] =1;


    }








    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,1,1,0}, {0,0,0,0,0}};
        System.out.println("[ result ] : " + solution(board));
    }

}
