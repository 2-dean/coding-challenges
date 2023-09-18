package org.programmers.introdution.day19;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q19_2 {

    /**
     *  문제 :잘라서 배열로 저장하기
     *
     *  문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public static String[] solution(String my_str, int n) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length() / n ; i++) {
            list.add(my_str.substring(i * n, n * (i +1)));
        }

        if (my_str.length() % n != 0 ){
            list.add(my_str.substring((my_str.length() / n) * n)); // 담고 남은 나머지
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println("result " + Arrays.toString(solution("abc1Addfggg4556b", 6)));
    }

}
