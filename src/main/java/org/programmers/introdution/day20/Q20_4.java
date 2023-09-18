package org.programmers.introdution.day20;

public class Q20_4 {

    // 다항식 만들기

    // 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    // 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    // 덧셈으로 이루어진 다항식 polynomial 이 매개변수로 주어질 때,
    // 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    // 같은 식이라면 가장 짧은 수식을 return 합니다.
    public static String solution(String polynomial) {

        // 공백을 기준으로 식 나누기(?)
        String[] strings = polynomial.split(" ");
        for (String str : strings){
            System.out.println("str :>" + str + "<");
        }

        // X의 앞에있는 숫자 / 숫자 만 있는것 나누기
        int xNum = 0;
        int num = 0;

        for (int i = 0 ; i < strings.length; i++) {
            // 변수x 포함
            if(strings[i].contains("x")) {
                String[] array = strings[i].split("x");
                int length = array.length;

                if(length == 0){
                    xNum += 1;
                 } else {
                    xNum += Integer.parseInt(array[0]);
                 }
            }  else if (strings[i].contains("+")) {
                // + 기호일 경우
                num += 0;
            } else {
                // 숫자일 경우
                num += Integer.parseInt(strings[i]);
            }

        }

        // xNum : 0,1, 2이상
        // NUM : 0, !=0

        // xNum == 0 , num == 0  :: 아무것도 출력안함
        // xNum == 0 , num == 1  :: num

        // xNum == 1 , num == 0  :: X
        // xNum == 1 , num == 1  :: X + 1

        // xNum > 1 , num == 0  ::  xNum
        // xNum > 1 , num == 1  ::  xNum + num


        if (xNum == 0 && num >= 1) {
            // 1만 입력했을 경우 1 출력 ㄷ ㄷ ㄷ
            return num+"";
        } else if (xNum == 1 && num == 0) {
            return "x";
        } else if (xNum == 1 && num != 0) {
            return "x + " + num;
        } else if (xNum != 1 && num == 0) {
            return xNum+"x";
        } else if (xNum != 1 && num != 0){
            return xNum + "x + " + num;
        } else {
            // xNum == 0 , num == 0
            return "";
        }



    }


    public static void main(String[] args) {
        String polynomial = "1";

        String result = solution(polynomial);
        System.out.println("result : " + result);
    }
}
