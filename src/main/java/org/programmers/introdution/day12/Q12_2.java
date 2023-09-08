package org.programmers.introdution.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q12_2 {

    /**
     *  문제 :
     * 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
     */
    public static int[] solution(String my_string) {

        List<Integer> numbers = new ArrayList<>();

        for (char str : my_string.toCharArray()) {
        // 숫자, 문자 확인
            if(Character.isDigit(str)) {
                int number = Character.getNumericValue(str);
                // 숫자만 담기
                numbers.add(number);
            }
        }
        // 오름차순으로 정렬하기
        Collections.sort(numbers);

        int[] answer = new int[numbers.size()];
        for (int i=0; i<numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution("hi12392");
        System.out.println(result);
    }

}
