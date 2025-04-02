
public class NextBigNumber {

    public int betterSolution(int n) {
        //효율적인 버전!
        int count = Integer.bitCount(n);

        while (Integer.bitCount(++n) != count);

        return n;
    }

    public static int solution(int n) {
        /*
        조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
        조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
        조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
         */
        //n 을 2진수로 변환
        String binaryString = Integer.toBinaryString(n);
        // 1의 갯수를 센다
        String s = binaryString.replaceAll("0", "");
        int count = s.length();
        // n 보다 큰 수를 2진수로 변환 하면서 1의 갯수가 같은 것을 찾는다
        int newCount = 0;
        int newNum = 0;
        int i = 0;
        while (newCount != count) {
            newNum = n + ++i;
            String newNumStr = Integer.toBinaryString(newNum).replaceAll("0", "");
            newCount = newNumStr.length();
            if (newCount == count) {
                break;
            }
        }

        return newNum;
    }


    public static void main(String[] args) {
        solution(78);
    }
}
