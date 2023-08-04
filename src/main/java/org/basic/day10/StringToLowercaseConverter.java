package org.basic.day10;

public class StringToLowercaseConverter {
    static String solution(String myString) {

        return   myString.toLowerCase();
    }
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        System.out.println("[ result ] : " +  solution(myString)  );
    }
}
