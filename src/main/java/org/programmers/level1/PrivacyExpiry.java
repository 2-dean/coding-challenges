package org.programmers.level1;

import java.util.*;

import static java.lang.Integer.parseInt;

public class PrivacyExpiry {
    // 한달을 28일로 고정했기 때문에 정수로 변환해서 사용
    // 일반 날짜를 사용하ㅏㄹ 경우 LocalDate 사용하기
    /*
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate today = LocalDate.parse("2022.05.19", formatter);

        LocalDate expiryDate = today.plusMonths(6); // 6개월 추가

        System.out.println(expiryDate.format(formatter)); // 2022.11.19
     */



    //날짜를 int 형식으로 변환하여 비교
    //YYYY.MM.DD 형식의 날짜를 정수 형태(YYYY * 12 * 28 + MM * 28 + DD)로 변환 일 단위의 정수로 변환 //date객체로 쓰면 불편해서 ..
    private static int convertDate(String date) {
        String[] parts = date.split("\\.");
        int year = parseInt(parts[0]);
        int month = parseInt(parts[1]);
        int day = parseInt(parts[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
    public static int[] solution(String today, String[] terms, String[] privacies)  {

        // 1. 약관 종류별 유효기간 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] termArr = term.split(" ");
            String type = termArr[0];           //약관종류
            int duration = parseInt(termArr[1]);// 유효기간

            termMap.put(type, duration);
        }

        // 각 개인정보의 보관 만료일 계산후 비교
        List<Integer> result = new ArrayList<>();
        int todayDays = convertDate(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyDate = privacies[i].split(" ");

            int collectedDate = convertDate(privacyDate[0]);
            String termType = privacyDate[1];

            int expiryDate = collectedDate + (termMap.get(termType) * 28) - 1; //유효기간 다음날 부터 파기 대상 보관가능한 마지막 날짜 포함

            if (expiryDate < todayDays) {
                result.add(i + 1); //인덱스 저장
            }
        }

        // 4. 결과 반환
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        solution("2022.05.19" // 오늘날짜
                , new String[]{"A 6", "B 12", "C 3"} // 약관종류, 유효기간
                , new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}//수집일자. 약관종류
                );
    }
}
