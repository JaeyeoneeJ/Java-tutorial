// 날짜와 시간 Quiz
// 오늘의 날짜와 시간을 [연도/월/일 시간:일자]의 형식으로 값을 출력

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("현재 시간: " + now);
    }
}