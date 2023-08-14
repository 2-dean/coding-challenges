package org.crawling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Selenium {
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; //드라이버 ID
    public static final String WEB_DRIVER_PATH = "C:\\chromedriver.exe"; //드라이버 경로

    public static void main(String[] args) throws IOException {
        //드라이버 설정
        try {
            System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //크롬 설정을 담은 객체 생성
        ChromeOptions options = new ChromeOptions();
        //브라우저가 눈에 보이지 않고 내부적으로 돈다.
        //설정하지 않을 시 실제 크롬 창이 생성되고, 어떤 순서로 진행되는지 확인할 수 있다.
        //options.addArguments("headless");

        //위에서 설정한 옵션은 담은 드라이버 객체 생성
        //옵션을 설정하지 않았을 때에는 생략 가능하다.
        //WebDriver객체가 곧 하나의 브라우저 창이라 생각한다.
        WebDriver driver = new ChromeDriver(options);

        String word = "감자";
        //이동을 원하는 url
        //String url = "https://www.naver.com";
        String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=" + word;

        //WebDriver을 해당 url로 이동한다.
        driver.get(url);

        //브라우저 이동시 생기는 로드시간을 기다린다.
        //HTTP응답속도보다 자바의 컴파일 속도가 더 빠르기 때문에 임의적으로 1초를 대기한다.
        try {Thread.sleep(1000);} catch (InterruptedException e) {}

        //class="nav" 인 모든 태그를 가진 WebElement 리스트를 받아온다.
        //WebElement는 html의 태그를 가지는 클래스이다.
        List<WebElement> menu = driver.findElements(By.className("tab"));

        for (int i = 0; i < menu.size(); i++) {
            // view 라는 텍스트를 가진 WebElement를 클릭한다.
            if(menu.get(i).getText().equals("VIEW")) {
                menu.get(i).click();
                break;
            }
        }
        //1초 대기
        try {Thread.sleep(1000);} catch (InterruptedException e) {}


        // 검색옵션 열기 버튼 클릭
        WebElement searchOptionOpenBtn = driver.findElement(By.className("_search_option_open_btn"));
        searchOptionOpenBtn.click();
        //1초 대기
        try {Thread.sleep(1000);} catch (InterruptedException e) {}



        // 최신순 텍스트를 가진 WebElement를 클릭한다.
        WebElement sortList = driver.findElement(By.className("lineup"));
        List<WebElement> sort = sortList.findElements(By.className("txt"));
        for (int i = 0; i< sort.size(); i++){
//            System.out.println("sort.get(i) : " + sort.get(i).getText());
            if (sort.get(i).getText().equals("최신순")) {
                sort.get(i).click();
                break;
            }
        }
        try {Thread.sleep(1000);} catch (InterruptedException e) {}


        // 6개월 텍스트를 가진 WebElement를 클릭한다.
        WebElement termList = driver.findElement(By.className("term"));
        List<WebElement> term = termList.findElements(By.className("txt"));
        for (int i = 0; i< term.size(); i++){
            if (term.get(i).getText().equals("6개월")) {
                term.get(i).click();
                break;
            }
        }

        try {Thread.sleep(1000);} catch (InterruptedException e) {}

        // 블로그 버튼 클릭
        WebElement sourceList = driver.findElement(By.className("source"));
        List<WebElement> sources = sourceList.findElements(By.className("txt"));

        for (int i = 0; i < sources.size(); i++) {
            if (sources.get(i).getText().equals("블로그")) {
                sources.get(i).click();
                break;
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 블로그 목록을 가져온다.
        List<WebElement> title = driver.findElements(By.className("total_tit"));

        // ID 숫자를 담을 리스트 생성
        List<Integer> idNumbers = new ArrayList<>();

        for (WebElement element : title) {
            String idValue = element.getAttribute("id");
            Pattern pattern = Pattern.compile("sp_blog_(\\d+)");
            Matcher matcher = pattern.matcher(idValue);

            if (matcher.find()) {
                int idNumber = Integer.parseInt(matcher.group(1));
                idNumbers.add(idNumber);
            }
        }
        // ID 숫자 리스트 출력
        for (int i = 0; i < idNumbers.size(); i++) {
            System.out.println("ID 숫자 " + (i + 1) + ": " + idNumbers.get(i));
        }

        // 엑셀 파일 생성
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        int rowNumber = 0;
        for (int i = 0; i<title.size(); i++) {
            Row row = sheet.createRow(rowNumber++);
            row.createCell(0).setCellValue(title.get(i).getText()); // Title
            //제목을 모두 출력한다.
            //System.out.println("블로그: "+ title.get(i).getText());
        }

        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ddu\\study\\crawling\\selenium_" + word+".xlsx")) {
            workbook.write(outputStream);
        }
        workbook.close();
        System.out.println("엑셀 파일이 생성되었습니다.");
        try {
            //드라이버가 null이 아니라면
            if(driver != null) {
                //드라이버 연결 종료
                driver.close(); //드라이버 연결 해제

                //프로세스 종료
                driver.quit();
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
