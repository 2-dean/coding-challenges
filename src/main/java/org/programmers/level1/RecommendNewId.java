package org.programmers.level1;

public class RecommendNewId {
    /*
    아이디의 길이는 3자 이상 15자 이하여야 합니다.
    아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
    단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     */
    public static String solution(String new_id) {

        // 1단계: 소문자로 변환
        String lower = new_id.toLowerCase();
        StringBuilder newId = new StringBuilder(lower);
        System.out.println("1단계후: " + newId.toString());

        // 2단계: 허용되지 않은 문자 제거
        for (int i = newId.length() - 1; i >= 0; i--) { // 뒤에서부터 삭제
            char c = newId.charAt(i);
            if (!(Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.')) {
                newId.deleteCharAt(i);
            }
        }
        System.out.println("2단계후: " + newId.toString());

        // 3단계: 연속된 마침표(.)를 하나로 치환
        for (int i = newId.length() - 1; i > 0; i--) {
            if (newId.charAt(i) == '.' && newId.charAt(i - 1) == '.') {
                newId.deleteCharAt(i);
            }
        }
        System.out.println("3단계후: " + newId.toString());

        // 4단계: 처음과 끝에 위치한 마침표(.) 제거
        if (newId.length() > 0 && newId.charAt(0) == '.') {
            newId.deleteCharAt(0);
        }
        if (newId.length() > 0 && newId.charAt(newId.length() - 1) == '.') {
            newId.deleteCharAt(newId.length() - 1);
        }
        System.out.println("4단계후: " + newId.toString());

        // 5단계: 빈 문자열이라면 "a" 대입
        if (newId.length() == 0) {
            newId.append("a");
        }
        System.out.println("5단계후: " + newId.toString());

        // 6단계: 길이가 16자 이상이면 첫 15자만 유지 + 끝이 .이면 제거
        if (newId.length() > 15) {
            newId.delete(15, newId.length());
            if (newId.charAt(newId.length() - 1) == '.') {
                newId.deleteCharAt(newId.length() - 1);
            }
        }
        System.out.println("6단계후: " + newId.toString());

        // 7단계: 길이가 2 이하라면 마지막 문자를 반복해서 추가
        while (newId.length() < 3) {
            newId.append(newId.charAt(newId.length() - 1));
        }
        System.out.println("7단계후: " + newId);
        return new_id;
    }

    public static void main(String[] args) {

        //solution("...!@BaT#*..y.abcdefghijklm");
        solution("z-+.^.");
        //solution("=.=");
        //solution("123_.def");
        //solution("abcdefghijklmn.p");
    }
}

