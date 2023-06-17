package org.day9;

import java.util.ArrayList;
import java.util.List;

public class IsSuffix {

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        int result = solution(my_string,is_suffix);
        System.out.println("[ result ] : " + result);
    }


    static int solution(String my_string, String is_suffix) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        String str = "";
        for (int i=0; i<my_string.length(); i++) {
            str = my_string.substring(i, my_string.length());
            list.add(str);
        }

        for (int j=0; j<list.size(); j++) {
            if (is_suffix.equals(list.get(j))) {
                answer =  1;
                break;

            } else {
                answer =  0;
            }
        }

        return answer;
    }


}
