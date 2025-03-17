package org.programmers.level1;

import java.util.Stack;

public class Hamburger {
    /*
    상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
    상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고,
    아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
    즉, 2개의 햄버거를 포장하게 됩니다.

    빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 함
    1,2,3,1

    상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
    상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.
    1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기

    // 순서가 중요한 문제!! 배열 X 스택 이용

     */
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
                int size = stack.size();
                //1231순서
                if( stack.get(size - 4) == 1 &&
                    stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 &&
                    stack.get(size - 1) == 1 ){
                    // 햄버거를 만들었으므로 4개 pop
                    //pop()을 쓰면 햄버거를 만든 부분(마지막 4개)만 삭제하고, 이전 재료들은 남겨둘 수 있음
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                    answer++;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
    }
}
