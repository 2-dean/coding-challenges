package org.programmers.level2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Shiritori {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        // 탈락하는 사람, 몇번째에 탈락하는지

        // 단어를 map 에 넣기 -> 중복X >
        // 중복일경우 % n 해서 몇번째 사람인지 찾기. ..  map에 글자넣으면되니깐..
        // /3 해서 몇번째 턴인지 찾기
        Map<String, Integer> wordMap = new HashMap<>();

        // set으로 해도됨!
        // Set<String> wordSet = new HashSet<>();
        wordMap.put(words[0], 1);
        for (int i = 1; i < words.length; i++) {
            String nowWord = words[i];
            String preWord = words[i-1];
            String lastWord = preWord.substring(preWord.length() - 1);
            String firstWord = nowWord.substring(0, 1);
            int person =  (i + 1) % n == 0 ? n : (i + 1) % n;
            int turn = (i + 1) % n == 0 ? (i+1)/n : (i+1)/n +1;
            // 끝글자랑 맞고 나온적 없으면 okay
            if (lastWord.equals(firstWord) && !wordMap.containsKey(nowWord)) {
                wordMap.put(nowWord);
            } else {
                answer[0] = person;
                answer[1] = turn;
                break;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);

        return answer;
    }

    public static void main(String[] args) {
        solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
    }

}
