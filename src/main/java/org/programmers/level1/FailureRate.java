package org.programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FailureRate {
    static class Pair {
        int stage;
        double failRate;

        Pair(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
    }
    /*
     실패율은 다음과 같이 정의한다.
        스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
     * */
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 단계별 실패율 저장
        int[] challengers = new int[N + 1]; // 각 스테이지에 도달한 플레이어 수
        int[] failures = new int[N + 1]; // 각 스테이지에서 실패한 플레이어 수

        // 현재 멈춰 있는 사람 수 저장
        for (int stage : stages) {
            if (stage <= N) { // N+1은 클리어한 사람이므로 제외
                failures[stage]++;
            }
        }

        // 각 스테이지에 도달한 사람 수 계산
        int totalPlayers = stages.length; // 전체 인원 수
        for (int i = 1; i <= N; i++) {
            challengers[i] = totalPlayers; // 현재 스테이지에 도달한 인원
            totalPlayers -= failures[i]; // 다음 스테이지로 넘어간 인원 빼기
            System.out.println("challengers : " + challengers[i]);
        }
        //실패율 저장 (스테이지 번호와 같이)
        List<Pair> failRateList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failRate = (challengers[i] == 0) ?  0.0 : (double) failures[i] / challengers[i];
            failRateList.add(new Pair(i, failRate));
        }

        failRateList.sort((a, b) -> (b.failRate == a.failRate) ? Integer.compare(a.stage, b.stage) : Double.compare(b.failRate, a.failRate));
        // 정렬된 결과를 answer 배열에 담기
        for (int i = 0; i < N; i++) {
            answer[i] = failRateList.get(i).stage;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(5, stages);
    }
}
