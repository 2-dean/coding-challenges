package org.programmers.level1;

public class PressKeyPad {
    // 맨해튼 거리 계산 함수
    static int getDistance(int current, int target) {
        return Math.abs(current - target )/3 + Math.abs(current - target)%3;
    }
    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        //1,4,7 - 왼손
        //3,6,9 - 오른손
        //2,5,8,0 > 왼손 오른손중 가까운 손이, 같은경우 어느손 잡이 인지에 따라 다름
        //각 번호를 누른 손을 string으로 만들어서 return

        // 맨해튼 거리 사용해서 해야함

        // 왼손, 오른손 초기 위치 설정 (왼손은 * 위치, 오른손은 # 위치)
        int nowL = 10; // * 키 위치
        int nowR = 12; // # 키 위치



        // numbers 배열을 돌면서 각 숫자에 대해 처리
        for (int num : numbers) {
            // 1, 4, 7은 왼손
            if (num == 1 || num == 4 || num == 7) {
                nowL = num;
                answer.append("L");
            }
            // 3, 6, 9는 오른손
            else if (num == 3 || num == 6 || num == 9) {
                nowR = num;
                answer.append("R");
            }
            // 2, 5, 8, 0은 가까운 손을 사용
            else {
                if (num == 0) num = 11;
                int leftDist = getDistance(nowL, num);
                int rightDist = getDistance(nowR, num);

                // 왼손이 더 가까운 경우
                if (leftDist < rightDist) {
                    nowL = num;
                    answer.append("L");
                }
                // 오른손이 더 가까운 경우
                else if (leftDist > rightDist) {
                    nowR = num;
                    answer.append("R");
                }
                // 거리가 같은 경우
                else {
                    // 왼손잡이라면 왼손을 사용
                    if (hand.equals("left")) {
                        nowL = num;
                        answer.append("L");
                    }
                    // 오른손잡이라면 오른손을 사용
                    else {
                        nowR = num;
                        answer.append("R");
                    }
                }
            }
        }


        return answer.toString();
    }

    public static void main(String[] args) {
        solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
       // solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
       // solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
    }
}


