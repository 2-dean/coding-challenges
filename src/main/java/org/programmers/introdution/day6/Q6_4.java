package org.programmers.introdution.day6;

public class Q6_4 {

    /**
     *  문제 :
     *  문자열 my_string과 정수 n이 매개변수로 주어질 때,
     *  my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        char[] strArr = my_string.toCharArray();
        for (char str : strArr){
            for(int i=0; i<n; i++){
                answer.append(str);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        String my_string = "hello";
        String result = solution(my_string,3);
        System.out.println("result = " + result);
    }

}
