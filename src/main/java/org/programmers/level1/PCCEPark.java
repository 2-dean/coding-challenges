package org.programmers.level1;

public class PCCEPark {
    public static int solution(int[] mats, String[][] park) {
        int answer = 0;

        // 최대 가능한 정사각형 크기 저장
        int maxSquareSize = 0;
        //빈 자리 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("-1")) {  // 빈 공간 발견
                    int maxK = 1;

                    // 정사각형을 확장할 수 있는 최대 크기 찾기
                    while (i + maxK < park.length && j + maxK < park[i].length) {
                        boolean isSquare = true;

                        // k x k 모든 칸이 "-1"인지 체크
                        for (int x = i; x <= i + maxK; x++) {
                            for (int y = j; y <= j + maxK; y++) {
                                if (!park[x][y].equals("-1")) {
                                    isSquare = false;
                                    break;
                                }
                            }
                            if (!isSquare) break;
                        }

                        if (isSquare) {
                            maxK++;  // 정사각형 크기 증가
                        } else {
                            break;
                        }
                    }
                    maxSquareSize =  Math.max(maxSquareSize, maxK);
                }

            }
        }
        //돗자리 끼워보기
        // 돗자리 크기 비교
        for (int mat : mats) {
            if (mat <= maxSquareSize) {
                answer = Math.max(answer, mat);
            }
        }

        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{5,3,2}
                , new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"}
                                , {"A", "A", "-1", "B", "B", "B", "B", "-1"}
                                , {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
                                , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
                                , {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}
                                , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}});
    }
}
