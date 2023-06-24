package org.day10;

import java.util.ArrayList;
import java.util.List;

public class PrefixChecker10_2 {
    static int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> list = new ArrayList<>();

        // 접두사 전부 리스트에 담기
        String str = "";
        for (int i=0; i<my_string.length(); i++) {
            str = my_string.substring(0, my_string.length() - i);
            list.add(str);
        }
        // 있는지 확인
        for (int i=0; i< list.size(); i++) {
            if(is_prefix.equals(list.get(i))){
                answer =1;
                break;
            } else {
                answer = 0;

            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix= "ban";
        int result = solution(my_string, is_prefix);
        System.out.println(" [ result ] : " + result);
    }

}
