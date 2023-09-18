package org.programmers.introdution.day17;

import java.util.Arrays;

public class Q17_4 {

    /**
     *  문제 :OX퀴즈
     *  덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
     *  수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] equationArr = quiz[i].split(" ");

            System.out.println("equationArr : " + Arrays.toString(equationArr));

            // X, Y, Z의 값을 초기화
            int X = Integer.parseInt(equationArr[0]);
            int Y = Integer.parseInt(equationArr[2]);
            int Z = Integer.parseInt(equationArr[4]);


            // X, Y, Z 값을 계산하여 결과 문자열 생성
            int result = 0;
            if (equationArr[1].equals("+")) {
                result = X + Y;
            } else if (equationArr[1].equals("-")) {
                result = X - Y;
            }

           if (result == Z) {
               answer[i] = "O";
           } else {
               answer[i] = "X";
           }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
    }

}
