package org.programmers.level1;

import java.util.*;


public class GetReportResults {
    public static int[] solution(String[] id_list, String[] report, int k) {
        // 유저 : id_list, 유저 - 유저가신고한 아이디 :  report, k번이상 신고당하면 정지\
        // 한사람이 한명을 여러번 신고 못함
        // 신고 결과를 메일로 받은 횟수를 리턴

        // 누가 누구를 신고했는지 기록
        Map<String, Set<String>> reportMap = new HashMap<>(); // 신고자 -> 피신고자 목록
        for (String r : report) {
            String[] parts = r.split(" ");
            String from = parts[0];
            String to = parts[1];

            reportMap.putIfAbsent(from, new HashSet<>());
            reportMap.get(from).add(to); // 중복 신고 방지됨
        }

        // 신고당한 사람 횟수 카운팅
        Map<String, Integer> reportedCount = new HashMap<>();
        for (Set<String> reportedSet : reportMap.values()) {
            for (String reported : reportedSet) {
                reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
            }
        }

        // 정지 대상유저 목록
        Set<String> bannedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportedCount.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }

        // 메일 받을 사람 카운트. . .
        int[] answer = new int[id_list.length];
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            nameToIndex.put(id_list[i], i);
        }
        for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
            String reporter = entry.getKey();
            Set<String> reportedSet = entry.getValue();
            for (String reported : reportedSet) {
                if (bannedUsers.contains(reported)) {
                    answer[nameToIndex.get(reporter)]++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}
                , new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}
                , 2);
    }
}
