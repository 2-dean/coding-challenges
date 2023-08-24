package org.programmers.introdution.day9;

import java.util.HashMap;
import java.util.Map;

public class Q9_2 {

    /**
     *  문제 :
     *  머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
     *  그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때,
     *  letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
     *  모스부호는 다음과 같습니다.
     */
    public static String solution(String letter) {
        String answer = "";
        //String[] alphabetArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, String> m = new HashMap<>();
        m.put(".-","a");
        m.put("-...","b");
        m.put("-.-.","c");
        m.put("-..","d");
        m.put(".","e");
        m.put("..-.","f");
        m.put("--.","g");
        m.put("....","h");
        m.put("..","i");
        m.put(".---","j");
        m.put("-.-","k");
        m.put(".-..","l");
        m.put("--","m")
        ;m.put("-.","n");
        m.put("---","o");
        m.put(".--.","p");
        m.put("--.-","q");
        m.put(".-.","r");
        m.put("...","s");
        m.put("-","t");
        m.put("..-","u");
        m.put("...-","v");
        m.put(".--","w");
        m.put("-..-","x")
        ;m.put("-.--","y");
        m.put("--..","z");

        String[] letterArr = letter.split(" ");
        System.out.println("letterArr " + letterArr);
        for(String str : letterArr) {
            answer += m.get(str);
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String morse = ".... . .-.. .-.. ---";
        solution(morse);
    }

}
