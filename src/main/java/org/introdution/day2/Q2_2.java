package org.introdution.day2;

import java.util.ArrayList;
import java.util.List;

public class Q2_2 {

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 일단 통분 하고 계산
       int numer = numer1 * denom2 + numer2 * denom1;
       int denom = denom1 * denom2;

       int max =  1;

        // 최대 공약수를 찾아서 나눠줌
       for (int i = 1; i<=numer && i<=denom; i++) {
           if(numer% i == 0 && denom % i == 0) {
               max = i;
           }
       }

       numer = numer / max;
       denom = denom / max;

        return new int[]{numer, denom};

    }

    public static void main(String[] args) {
        int[] result = solution(9,2,1,3);
        for(int num : result){
            System.out.println(num);
        }
    }

}
