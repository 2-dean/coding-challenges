package org.programmers.practice.lv1;

import java.util.HashMap;
import java.util.Map;

public class Q176963 {

    /**
     *  문제 :추억 점수
     */
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,  Integer> people = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            people.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int count= 0;
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                if(people.get(person) != null) {
                    count += people.get(person);
                }
            }
            answer[i] = count;
        }
        return answer;

    }

    public static void main(String[] args) {

    }

}
