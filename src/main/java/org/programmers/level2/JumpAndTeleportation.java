package org.programmers.level2;

public class JumpAndTeleportation {

    public static int solution(int n) {
        int ans = 0;
        while (n!=0){
            if (n %  2 == 1) { // 홀수가 나오면 점프 . .!_!
                n--;
                ans++;
            } else {
                n /= 2;
            }
            System.out.println("n : " + n + ", ans : "+ ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        solution(5);
    }
}
