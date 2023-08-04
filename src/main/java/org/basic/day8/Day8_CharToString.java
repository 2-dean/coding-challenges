package org.basic.day8;

public class Day8_CharToString {

    static String solution(String my_string, int[] index_list) {
        String answer = "";

        char [] string = my_string.toCharArray();

        for(int i=0; i<string.length; i++) {
            for (int j=0; j < index_list.length; j++){
                System.out.println("index_list " + j + " : " + index_list[j]);
                answer += string[index_list[j]];
            }
            break;
        }

        return answer;
    }


    public static void main(String[] args) {

        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = solution(my_string, index_list);

        System.out.println("[ result ] : "+ result);
    }
}
