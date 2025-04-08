package org.programmers.level2;


//예상대진표
//번호 변화의 규칙을 잘 찾아서 그걸 반복하면서 조건을 만족할 때까지 진행하는 문제
public class EstimatedMatchSheet {
    public static int solution(int n, int a, int b) {
        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        System.out.println(round);
        return round;
    }

    public static void main(String[] args) {
        solution(8, 1, 3);
    }

}
