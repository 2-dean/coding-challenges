package org.programmers.basic.day16;

public class Q16_5 {

    /**
     *  문제 :특정한 문자를 대문자로 바꾸기
     */
    public static String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(Character.toString(arr[i]).equals(alp)) {
                answer.append(Character.toUpperCase(arr[i]));
            } else {
                answer.append(arr[i]);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        solution("programmers","p");
    }

}
