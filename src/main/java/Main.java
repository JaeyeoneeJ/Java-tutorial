// 날짜와 시간 다루기

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("now()를 활용하여 생성"); // 현재의 날짜 시간
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of()를 활용하여 생성"); // 지정하는 값을 필드에 담음
        LocalDate newDate = LocalDate.of(2023, 3, 27);
        LocalTime newTime = LocalTime.of(22, 50, 55);

        System.out.println(newDate);
        System.out.println(newTime);
    }
}