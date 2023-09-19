package org.programmers.introdution.day22;

public class Q22_1 {

    /**
     *  문제 :저주의 숫자 3
     *
     *  3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
     *
     *
     *  문제의 주어진 마을은 3의 배수이거나 숫자에 3이 들어가면 그 수를 생략하고 다음 수로 쓰는 규칙을 가지고 있다.
     *
     * 그 다음수를 쓰다보니 3을 4로 쓰면 4는 5가되는 방식이다.
     * 그럼 밀리는 수가 점점 누적되니 늘어나는 수도 누적되도록 구현해야한다.
     *
     * 입력받은 수를 순차적으로 돌며 3의 배수이거나 3이 포함된 경우 숫자를 더해서 해당 수를 반환하도록 하였
     */
    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[ result ] : " + solution(15));
    }

}
