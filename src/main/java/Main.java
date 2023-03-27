// 날짜와 시간 형식 수정

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat);

        // 지정한 형식대로 출력
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = newFormatter.format(LocalDate.now());
        System.out.println(myDate);
    }
}