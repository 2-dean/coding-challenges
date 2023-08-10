package org.introdution;

import java.util.*;

public class Mode {

    // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    // 정수 배열 array 가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    // 최빈값이 여러 개면 -1을 return 합니다.
    public static int solution(int[] array) {
        int answer = 0;

        List<Integer> maxKey = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        // map : {1=1, 2=1, 3=3, 4=3}

        // map value 의 최대값
        int maxValue = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){

            if (maxValue == entry.getValue()) {
                maxKey.add(entry.getKey());
                //System.out.println("maxVaue  : " + maxValue + ", maxKey : " + maxKey);
            }
        }

        if(maxKey.size() > 1) {
            answer = -1;
        } else {
            answer = maxKey.get(0);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4, 4, 4};

        int result = solution(array);
        System.out.println("result : " + result);
    }



}
