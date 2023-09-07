package org.programmers.introdution.day12;

public class Q12_1 {

    /**
     *  문제 :
     *  영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
     *  문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static  String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] aioue =  {"a", "i", "o", "u", "e"};
        //String[] splitArray = my_string.split("u");

        if(my_string.contains("a")) {
            my_string.split("a");
        }
        if(my_string.contains("i")) {
            my_string.split("i");
        }
        if(my_string.contains("o")) {
            my_string.split("o");
        }
        if(my_string.contains("u")) {
            System.out.println("contain U");

//            String[] splitArray = my_string.split("u");
//            for (String part : splitArray) {
//                System.out.println(part);
//            }
        }

        if(my_string.contains("e")) {
            my_string.split("e");
        }

        return my_string;
    }

    public static void main(String[] args) {
        String result = solution("bus");
        System.out.println(result);
    }

}
