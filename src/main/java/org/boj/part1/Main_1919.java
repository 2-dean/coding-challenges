package org.boj.part1;

import java.util.Scanner;

public class Main_1919 {

/* 문제 : 애너그램 만들기
    애너그램 : 단어의 구성(알파벳과 그 개수)이 완전히 같은단어
    없애야 하는 문자 :  공통 문자를 제외한 전부

    dared {'a': 1,        'd':2, 'e': 1,  'r':1 } // d 1개 제거
    bread {'a': 1, 'b':1, 'd':1, 'e': 1 , 'r':1 } // b 제거

*/
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i=0; i < str.length(); i ++) {
            count[str.charAt(i) - 'a']++; // 알파벳에 해당하는 인덱스 번호가 ++됨
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // a와 b의 알파벳 구성

 /*    함수로 뺌!
        int[] countA = new int[26]; // 알파벳이 26자 [1, 0, 0, 2]
        int[] countB = new int[26];
        for (int i=0; i < a.length(); i ++) {
            countA[a.charAt(i) - 'a']++; // 알파벳에 해당하는 인덱스 번호가 ++됨
        }
        for (int i=0; i < b.length(); i ++) {
            countB[b.charAt(i) - 'a']++; // 알파벳에 해당하는 인덱스 번호가 ++됨
        }
*/
        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int answer = 0;

        for(int i=0; i<26; i++){
            // 대소 구분 하지 않고 더하는 방법!
            // abs =  절대값 리턴 ! 음수가 나올경우에 절대값을 취한 값을 받아서 대소 비교와 마찬가지 로! ~적용
            answer += Math.abs(countA[i] - countB[i]);

            // 그냥 빼면 대소구분 해야함
          /*  if (countA[i] > countB[i])
                answer += countA[i] - countB[i];

            if (countB[i] > countA[i])
                answer += countB[i] - countA[i];*/
        }

        System.out.println(answer);


    }

}
