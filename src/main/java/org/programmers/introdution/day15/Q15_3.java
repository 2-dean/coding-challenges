package org.programmers.introdution.day15;

public class Q15_3 {

    /**
     *  문제 : 한 번만 등장한 문자
     *
     *  문자열 s가 매개변수로 주어집니다.
     *  s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     *  한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
     *
     *
     *  s는 소문자로만 이루어져 있습니다.
     */
    public static  String solution(String s) {
        String answer = "";

        int[] alphabet = new int[26];

        // 알파벳이 몇개인지 담기
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(i)  : " + s.charAt(i));
            alphabet[s.charAt(i) - 'a']++;
        }

        // 한번만 등장하는 문자를 찾아서
        // 오름차순 정렬
        for (int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == 1) {
                char c = (char) (i + 'a');
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution("hello"));
    }

}
