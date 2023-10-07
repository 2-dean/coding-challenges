package org.programmers.practice.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q159994 {

    /**
     *  문제 :카드 뭉치
     */
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        ArrayList<String> cardList1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> cardList2 = new ArrayList<>(Arrays.asList(cards2));

        for (int i = 0; i < goal.length; i++) {
            if (cardList1.size() > 0 && goal[i].equals(cardList1.get(0))) {
                cardList1.remove(0);
            } else if (cardList2.size() > 0 && goal[i].equals(cardList2.get(0))) {
                cardList2.remove(0);
            } else {
                answer = "No";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));


    }

}
