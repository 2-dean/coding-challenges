package org.programmers.level1;

import java.util.*;

public class DataAnalysis {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext : 뽑아낼 데이터
        // val_ext : 뽑아낼 기준
        // sort_by : 정렬기준
        //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        Map<String, Integer> indexMap = Map.of(
                "code", 0,
                "date", 1,
                "maximum", 2,
                "remain", 3
        );

        int extIdx = indexMap.get(ext);
        int sortIdx = indexMap.get(sort_by);

        System.out.println("extIdx: " + extIdx + ",sortIdx: " + sortIdx);

        //기준 이내 담기
        List<int[]> newList= new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            System.out.println("날짜 : " + data[i][1]);
            if (data[i][extIdx] < val_ext) {
                newList.add(data[i]);
            }
        }

        // 정렬
        newList.sort(Comparator.comparingInt(row -> row[sortIdx]));



        return newList.toArray(new int[newList.size()][]);


    }

    public static void main(String[] args) {

        solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain");
    }
}
