package org.programmers.basic.day13;

import java.util.ArrayList;
import java.util.List;

public class Question13_3 {

    public static void main(String[] args) {
        String[] num_list = {"l", "r", "l", "r"};

        String[] result = solution(num_list);
        for(String num : result) {
        System.out.println("√num : " + num);
        }
    }



    public static String[] solution(String[] str_list) {
        // 문자열 리스트 str_list 에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
        // str_list 에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면
        // 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
        // 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로
        // 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return 하도록 solution 함수를 완성해주세요.
        // "l"이나 "r"이 없다면 빈 리스트를 return 합니다.
        List<String> list = new ArrayList<>();

        int leftIndex = -1;
        int rightIndex = -1;

        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                leftIndex = i;
                break;

            } else if (str_list[i].equals("r")) {
                rightIndex = i;
                break;
            }
        }

        // l. r 둘다 있을때
       if (leftIndex != -1 && rightIndex != -1) {
           if(leftIndex < rightIndex) {
               for(int i=0; i<leftIndex; i++) {
                   list.add(str_list[i]);
               }
           } else {
               for(int i = rightIndex; i< str_list.length; i++){
                   list.add(str_list[i]);
               }
           }
       } else if (leftIndex != -1) {
           // "l"이 먼저 나왔을 경우
           for (int i = 0; i < leftIndex; i++) {
               list.add(str_list[i]);
           }
       } else if (rightIndex != -1) {
           // "r"이 먼저 나왔을 경우
           for (int i = rightIndex + 1; i < str_list.length; i++) {
               list.add(str_list[i]);
           }
       }

        return list.toArray(new String[0]);
    }



} //class
