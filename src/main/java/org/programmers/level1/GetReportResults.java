package org.programmers.level1;

import java.util.*;


public class GetReportResults {
    public static int[] solution(String[] id_list, String[] report, int k) {
        // 유저 : id_list, 유저 - 유저가신고한 아이디 :  report, k번이상 신고당하면 정지\
        // 한사람이 한명을 여러번 신고 못함
        // 신고 결과를 메일로 받은 횟수를 리턴

        // 각 유저가 신고한 유저들을 관리하기 위한 Set
        Map<String, Set<String>> reportMap = new HashMap<>();
        // 신고당한 유저들의 신고횟수를 카운트할 Map
        Map<String, Integer> mailCount = new HashMap<>(); // 결과 메일 받을 횟수 저장

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>()); // 초기화
            mailCount.put(id, 0);
        }
        // 신고데이터 중복 처리
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0]; //신고자
            String reported = parts[1]; //신고당한사람

            // 중복 신고 방지 (Set이므로 중복 자동 제거)
            reportMap.get(reported).add(reporter);
        }
        System.out.println(reportMap.toString());
        // 정지된 유저 찾기
        for (String reportedUser : reportMap.keySet()) {
            if (reportMap.get(reportedUser).size() >= k) {
                for (String reporter : reportMap.get(reportedUser)) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }



        // 결과 배열 만들기
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}
                , new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}
                , 2);
    }
}
