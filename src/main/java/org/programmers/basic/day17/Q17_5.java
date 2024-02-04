package org.programmers.basic.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Q17_5 {

    /**
     *  문제 :
     */
    public static String[] solution(String my_string) {
        String[] s = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if(!s[i].equals("")) {
                list.add(s[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
    }

}
