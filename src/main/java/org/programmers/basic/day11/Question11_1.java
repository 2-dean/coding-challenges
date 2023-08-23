package org.programmers.basic.day11;

public class Question11_1 {

    public static void main(String[] args) {
        String my_string = "Programmer";
        int[] result = solution(my_string);
        System.out.println("[ result ] : " + result);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }


    static int[] solution(String my_string) {
        int[] answer = new int[52]; // 초기화시 전부 0으로 setting
        for(char str : my_string.toCharArray()){
            if(str >= 'A' && str<= 'Z') { // 대문자일경우
                int index = str - 'A';
                answer[index]++;
            } else if (str >= 'a' && str<= 'z') { //소문자일 경우
                int index = str - 'a' + 26;
                answer[index]++;
            }
        }

        return answer;
    }


} //class
