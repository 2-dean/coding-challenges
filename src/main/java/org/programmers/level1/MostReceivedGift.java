package org.programmers.level1;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostReceivedGift {
    public static int solution(String[] friends, String[] gifts) {
        // 1️⃣ 친구별 선물 준 횟수 & 받은 횟수 카운트

        Map<String, Integer> giveCount = new HashMap<>();
        Map<String, Integer> receiveCount = new HashMap<>();

        // 친구별 기본값 0으로 초기화
        for (String friend : friends) {
            giveCount.put(friend, 0);
            receiveCount.put(friend, 0);
        }

        // gifts 배열 돌면서 계산
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            giveCount.put(giver, giveCount.get(giver) + 1);
            receiveCount.put(receiver, receiveCount.get(receiver) + 1);
        }

        // 선물포인트 계산 (준 갯수- 받은갯수)
        Map<String, Integer> giftPoint = new HashMap<>();

        for (String friend : friends) {
            int point = giveCount.get(friend) - receiveCount.get(friend);
            giftPoint.put(friend, point);
        }

        //  친구별 선물 주고받은 내역 저장
        Map<String, Map<String, Integer>> giftHistory = new HashMap<>();
        for (String friend : friends) {
            giftHistory.put(friend, new HashMap<>());
        }

        // 주고받은 선물 기록 저장
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            giftHistory.get(giver).put(receiver, giftHistory.get(giver).getOrDefault(receiver, 0) + 1);
        }

        //다음 달 예상 선물 개수 계산
        Map<String, Integer> nextGifts = new HashMap<>();
        for (String friend : friends) {
            nextGifts.put(friend, 0);
        }

        // 친구 관계를 두 명씩 비교하면서 다음 달 선물 계산
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String friendA = friends[i];
                String friendB = friends[j];

                int givenAtoB = giftHistory.get(friendA).getOrDefault(friendB, 0);
                int givenBtoA = giftHistory.get(friendB).getOrDefault(friendA, 0);

                if (givenAtoB > givenBtoA) {
                    nextGifts.put(friendA, nextGifts.get(friendA) + 1);
                } else if (givenAtoB < givenBtoA) {
                    nextGifts.put(friendB, nextGifts.get(friendB) + 1);
                } else { // 주고받은 횟수가 같으면 선물 지수 비교
                    int pointA = giftPoint.get(friendA);
                    int pointB = giftPoint.get(friendB);

                    if (pointA > pointB) {
                        nextGifts.put(friendA, nextGifts.get(friendA) + 1);
                    } else if (pointA < pointB) {
                        nextGifts.put(friendB, nextGifts.get(friendB) + 1);
                    }
                }
            }
        }


        int maxGifts = Collections.max(nextGifts.values());
        return maxGifts;
    }

    public static void main(String[] args) {
        String[] friends = new String[] {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = new String[] {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends, gifts));
    }

}
