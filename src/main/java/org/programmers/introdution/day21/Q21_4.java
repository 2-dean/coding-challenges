package org.programmers.introdution.day21;

public class Q21_4 {

    /**
     *  문제 :외계어 사전
     *
     *  PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
     *
     */
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;

        //  단어에 spell 이 모두 들어갔는지 확인


        boolean result = false;
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < dic[i].length(); j++) {
                int count = spell.length;
                for (int k = 0; k < spell.length; k++) {
                    if (dic[i].charAt(j) == spell[i].charAt(0)) {
                        System.out.println("spell[i].charAt(0) : " + spell[i].charAt(0));
                        count--;
                        System.out.println("count : " +     count);
                    }
                }
                if (count == 0) {
                    System.out.println("단어있음");
                } else {
                    System.out.println("단어없음");
                }
            }
            System.out.println("---");
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        solution(spell, dic);
    }

}
