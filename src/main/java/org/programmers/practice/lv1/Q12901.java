package org.programmers.practice.lv1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class Q12901 {

    /**
     *  문제 :2016년
     */
    public static String solution(int a, int b) {
        String answer = "";
        int year = 2016;
        int month = 1;
        int date = 1;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, date);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] day = {"SUN","MON","TUE","WEN","THU","FRI","SAT"};

        LocalDate localDate = LocalDate.of(year, month, date);
        String dayName = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);

        answer = day[dayOfWeek - 1];
        System.out.println(dayName.toUpperCase());
        return answer;
    }

    public static void main(String[] args) {
        solution(5,24);
    }

}
