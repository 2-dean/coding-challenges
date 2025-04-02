package org.programmers.level2;

public class Carpet {
    public static int[] solution(int brown, int yellow) {

        int total = brown + yellow;
        // total의 약수 찾기
        for (int width = total; width >= 1; width--) {
            if (total % width == 0) {//약수면
                int height = total / width; // 대응하는 수

                if (width >= height) {
                    if ((width-2) *(height-2) == yellow) {
                        return new int[]{width, height};
                    }
                }

            }
        }
        return new int[]{0, 0};  // 문제 조건상 여기까지 안 옴
    }

    public static void main(String[] args) {
        solution(10, 2);
    }
}
