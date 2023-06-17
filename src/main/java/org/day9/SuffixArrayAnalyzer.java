package org.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuffixArrayAnalyzer {

    public static void main(String[] args) {
        String my_string = "banana";
        String[] result = solution(my_string);
        System.out.println("[ result ] : " + result);
    }


    static String[] solution(String my_string) {

        List<String> list = new ArrayList<>();
        String str = "";
        for (int i=0; i<my_string.length(); i++) {
            str = my_string.substring(i,my_string.length());
            System.out.println("str : " + str);
            list.add(str);
        }

        String[] answer = new String[list.size()];
        for (int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }


}
