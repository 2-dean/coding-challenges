package org.programmers.level1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

/*
 다트 게임의 점수 계산 로직은 아래와 같다.

다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고
각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며
스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다.
아차상(#) 당첨 시 해당 점수는 마이너스된다.

스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
 */
public class Dart {
    public static int solution(String dartResult) {
        int answer = 0;

        int[] score = new int[3]; // 3번의 기회
        int idx = 0;//점수 인덱스

        char[] charArr = dartResult.toCharArray();

        int i = 0;
        while (i < charArr.length) {
            int num = 0;
            // 숫자처리
            if (isDigit(charArr[i])) {
                num = charArr[i] - '0'; //  문자인 숫자를 숫자로
                if (i + 1 < charArr.length && charArr[i + 1] == '0') { //10 처리
                    num = 10;
                    i++;
                }
                score[idx] += num;
                i++;
            }

            // S, D, T 처리
            if (charArr[i] == 'S'){
                score[idx] = (int) Math.pow(score[idx], 1);
            } else if (charArr[i] == 'D'){
                score[idx] = (int) Math.pow(score[idx], 2);
            } else if (charArr[i] == 'T'){
                score[idx] = (int) Math.pow(score[idx], 3);
            }
            i++;

            //스타상(*) , 아차상(#) 처리
            /*
            스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
            스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
            스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
            Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
             */
            if (i < charArr.length  && charArr[i] == '*'){
                score[idx] *= 2;
                if (idx > 0) { //중첩 스타상 2 배
                    score[idx - 1] *= 2;
                }
                i++;
            }
            if (i < charArr.length && charArr[i] == '#'){
                score[idx] *= -1;
                i++;
            }
            idx++; //다음기회로
        }
        // 모든 점수 합산
        for (int s : score) {
            answer += s;
        }


        return answer;
    }

    public static void main(String[] args) {
        solution("1S2D*3T");
    }
}
