package org.day00;

public class FloatIntegerExtractor {

    static int solution(double flo) {
        return (int)flo;
    }



    public static void main(String[] args) {

        double flo = 1.42;
        System.out.println("[ result ] : " +  solution(flo));
    }
}
