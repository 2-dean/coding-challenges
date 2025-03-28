package org.programmers.level1;
//11,13,14,15,21,24
public class DeliveryBox {
    public static int solution(int n, int w, int num) {
        int answer = 0;

        //int[][] boxes = new int[n%w == 0 ? n/w : n/w + 1][w] ;
        int rows = (n % w == 0) ? (n / w) : (n / w + 1);
        int[][] boxes = new int[rows][w];


        // 모든 값을 -1로 초기화
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < w; j++) {
                boxes[i][j] = -1;  // 기본값을 -1로 설정
            }
        }
        // 상자 번호 채우기 -> 지그재그로 채워야함
        int idx = 1;
        for (int i = 0; i < rows; i++) {
            // 짝수 -> 왼 오, 홀수 -> 오 왼
            if (i % 2 == 0) {
                for (int j = 0; j < w && idx <= n; j++) {
                    boxes[i][j] = idx++;
                    System.out.print(boxes[i][j]+"\t");
                }
            } else {
                for (int j = w-1; j >= 0 && idx <= n; j--) {
                    boxes[i][j] = idx++;
                    System.out.print(boxes[i][j]+"\t");
                }
            }
            System.out.println();
        }


        // 상자 위치 찾기
        int targetRow = 0;
        int targetCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < w; j++) {
               if (boxes[i][j] == num) {
                    targetRow = i;
                    targetCol = j;
               }
            }
        }

        for (int i = targetRow; i < rows; i++) {
            if (boxes[i][targetCol] != -1) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(22,6,8);
       // System.out.println(solution(13,	3, 8));

    }

}
