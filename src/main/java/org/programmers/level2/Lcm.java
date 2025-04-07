package org.programmers.level2;

//least common multiple
/*  최대공약수(GCD)를 먼저 구한 뒤, 그걸로 LCM을 계산하는 거야.
    a와 b의 LCM을 구하고
    그 결과와 c의 LCM을 구하고
    그 결과와 d의 LCM을 구하고…
    이렇게 끝까지 하면 전체 최소공배수를 구할 수 있어!
 */
public class Lcm {
    //최대공약수(GCD)
    public static int gcd(int a, int b) {
        while (b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm (int a, int b){
        return a * b / gcd(a, b);
    }

    //여러수의 lcm
    public static int solution(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
            System.out.println(" : " + result);
        }

        return result;
    }

    public static void main(String[] args) {
        solution(new int[]{2, 6, 8, 14});
    }

}
