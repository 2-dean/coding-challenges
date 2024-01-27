package org.programmers.basic.day16;

public class Q16_4 {

    /**
     *  문제 :A 강조하기
     */
    public static String solution(String myString) {
        char[] arr = myString.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' ) {
                answer.append('A');
            } else if (arr[i] > 65){
                answer.append(Character.toString(arr[i]).toLowerCase());
            } else {
                answer.append(arr[i]);
            }

        }

        return answer.toString();

    }

    public static void main(String[] args) {
        solution("abstract algebra"	);
    }

}
