// 스트림 quiz
// - "이"씨 성을 가진 사람들의 수를 세보려고 함. 스트림을 활용해서 코드를 만들어보자
// - 이름: ["김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수"]

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- 스트림 퀴즈 --");
        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        System.out.println(names);
        long count = names.stream()
                .filter(str -> str.startsWith("이"))
                .count();
        System.out.println("count: " + count);
    }
}
