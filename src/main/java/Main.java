// 람다식(Lambda expression): 식별자 없이 실행 가능한 함수
// 즉, 함수의 이름을 따로 정의하지 않아도 곧바로 함수처럼 사용할 수 있는 것(익명 함수라고도 함)
// 람다를 사용하여 만든 익명 함수는 재사용이 불가능함
// 람다를 사용할 경우 비슷한 메소드를 중복되게 생성할 가능성이 있으므로 지저분해질 수 있음

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // 람다식 예제
        System.out.println("-- 람다식 예제 --");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("korea", "japan", "china", "france", "england"));
        Stream<String> stream = strList.stream();
        stream.map(str -> str.toUpperCase()).forEach(System.out::println); // ::(이중 콜론 연산자)는 매개변수를 중복해서 사용하고 싶지 않을 때 사용함. forEach(x -> System.out.println(x));와 같은 의미

        // 스트림: 데이터의 흐름
        // 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
        // 스트림을 활용해서 필터링, 데이터 변경, 다른 타입이나 자료구조로 변환 등을 할 수 있음
        // 스트림의 특징
        // - 스트림은 데이터 소스를 변경하지 않음
        // - 스트림은 작업을 내부적으로 반복 처리함
        // - 스트림은 컬렉션의 요소를 모두 읽고 나면 닫혀서 재사용이 불가능함. 그러므로 필요할 경우 재생성 해야 함

        // 스트림의 구조
        // 1. 스트림 생성
        // - 스트림을 이용하기 위해 먼저 스트림을 생성해야 함
        // - Stream<T> Collection.stream()을 이용하여 해당하는 컬렉션을 기반으로 하는 스트림을 생성할 수 있음
        // 2. 중간 연산
        // - 중간 단계로써 데이터의 형변환 혹은 필터링, 정렬 등 스트림에 대한 가공을 해줌
        // - map(변환) / sorted(정렬) / skip(스트림 자르기) / limit(스트림 자르기) 등이 있음
        // 3. 최종 연산
        // - 스트림의 요소를 소모해서 결과를 반환하는 단계. 최종 연산 이후에는 스트림이 닫히게 되고 더 이상 사용할 수 없음
        // - 최종 연산의 결과값은 단일 값일 수도 있으며 배열 혹은 컬렉션일 수도 있음
        // - collect()를 이용해서 다른 컬렉션으로 바꾸는 것, reduce를 이용해서 incremental calculation하는 것도 가장 많이 쓰이는 패턴임

        // 스트림 예제
        System.out.println("-- 스트림 예제 --");
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("속초");
        list.add("서울");

        System.out.println(list);
        List<String> result = list.stream() // 스트림 생성
                .limit(2) // 중간 연산
                .collect(Collectors.toList()); // 최종 연산
        System.out.println(result);

        System.out.println("list -> transformation -> set");
        Set<String> set = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        // 스트림 예제2: Array를 Stream으로 변환
        System.out.println("-- 스트림 예제2 --");
        String[] arr = {"엑셀보다 쉬운 SQL", "웹개발 종합반", "알고보면 알기쉬운 알고리즘", "웹개발의 봄, Spring"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(className -> System.out.println("수업명: " + className));
        System.out.println();

    }
}
