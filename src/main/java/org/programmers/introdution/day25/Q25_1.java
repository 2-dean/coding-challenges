package org.programmers.introdution.day25;

public class Q25_1 {

    /**
     *  문제 :문자열 밀기
     *  문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
     *  이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
     *  A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
     *
     */
    public static int solution(String A, String B) {

        int push =  A.length();

        // A를 이동시켜서 B가 되면 ok!
        if (!A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                if(A.equals(B.substring(i) + B.substring(0,i))) {
                    push = i;
                    return push; // 최소 횟수 리턴
                }
            }
        } else {
            push = 0;
        }

        if (push == A.length()) {
            push = -1;
        }

        return push;

    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + solution("hello", "ohell"));
    }

}
