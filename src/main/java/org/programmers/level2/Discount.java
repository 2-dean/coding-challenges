package org.programmers.level2;

import java.util.HashMap;
import java.util.Map;


// 슬라이딩윈도우 문제
public class Discount {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> discountMap = new HashMap<>(wantMap); // 깊은복사
            // 10일 안에 모든 할인품목이 없으면 다음날로
            for (int j = i; j < i + 10; j++) {
                if(discountMap.containsKey(discount[j])) { // 목록에 들어있으면 1개씩 삭제함
                    String item = discount[j]; // 가독성문제
                    discountMap.put(item, discountMap.get(item) -1);
                }
            }
            boolean matched = true;
            for (int val : discountMap.values()) {
                if (val > 0) { //항목이 남아있으면
                    matched = false;
                    break;
                }
            }
            if (matched) answer++;
          
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                 new int[]{3, 2, 2, 2, 1},
                 new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
    }
}
