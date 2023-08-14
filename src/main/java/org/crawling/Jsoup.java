package org.crawling;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.util.*;

public class Jsoup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("검색어를 입력하세요 : ");
        String word = scanner.nextLine();

        // 네이버블로그 제목만 크롤링 ~10개
        if (!word.equals("")) {
            try {
                String URL = "https://search.naver.com/search.naver?where=view&sm=tab_jum&query="+word;

                Document doc = org.jsoup.Jsoup.connect(URL).get();

                Map<String, String> map = new HashMap<>();


                Elements tits = doc.select(".total_tit");
                Elements dscs = doc.select(".total_dsc");

                for (int i=0; i<10; i++) {
                    Element titleElement = tits.get(i);
                    Element descriptionElement = dscs.get(i);

                    String title = titleElement.text();
                    String description = descriptionElement.text();
                    //System.out.println("Title: " + title);
                    //System.out.println("Description: " + description);

                    map.put(title, description);
                }

                // 추출한 데이터 출력
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    System.out.println("Title: " + entry.getKey());
                    System.out.println("Description: " + entry.getValue());
                }
                // 엑셀 파일 생성
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Data");

                int rowNumber = 0;


                for (Map.Entry<String, String> entry : map.entrySet()) {
                    Row row = sheet.createRow(rowNumber++);

                    row.createCell(0).setCellValue(entry.getKey()); // Title
                    row.createCell(1).setCellValue(entry.getValue()); // Description
                }

                try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ddu\\study\\crawling\\jsoup_" + word+".xlsx")) {
                    workbook.write(outputStream);
                }

                workbook.close();
                System.out.println("엑셀 파일이 생성되었습니다.");

            } catch (Exception e) {
                System.out.println("크롤링 실패 : " + e);
            } // end
        }



    }
}
