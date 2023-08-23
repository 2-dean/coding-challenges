package org.programmers.basic.day10;

public class StringReverser10_3 {
    static String solution(String my_string, int s, int e) {
        // 12번이 6, 11번이 7, 10번 -> 8 ,9-?
        String answer = "";
        char[] arr = my_string.toCharArray();
        char temp = 0;

        //6,7,8,9,10,11
        for (int i=0; s+i<=e-i; i++) {
            if(s < e-i) {
                System.out.println("count : " + i);
                System.out.println("s : " + (s + i));
                System.out.println("e : " + (e - i));
                temp = arr[s+i];
                arr[s+i] = arr[e - i];
                arr[e - i] = temp;
            } else {
                break;
            }
        }
        for (char item :arr){
            answer += item;
        }
        return answer;
    }


    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";

        String result = solution(my_string, 6, 12);
        System.out.println(" [ result ] : " + result);
    }

}
