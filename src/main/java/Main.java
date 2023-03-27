// Collection interface와 자료 구조
// Collection은 모든 자료구조가 구현(implement)하는 인터페이스
// 1. List: 순서가 있는 데이터의 집합이며 데이터의 중복을 허용함 => ArrayList, LinkedList, Stack 등
// 2. Set: 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않음 => HashSet, TreeSet 등
// 3. Map: 키(key)와 값(value)의 쌍으로 이루어진 데이터틔 집합. 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용함 => HashMap, TreeMap 등
// 4. Stack: 마지막에 넣은 데이터를 먼저 꺼내는 자료구조. LIFO(Last In First Out) => Stack, ArrayDeque 등
// 5. Queue: 먼저 넣은 데이터를 먼저 꺼내는 자료구조. FIFO(First In First Out) => Queue, ArrayDeque 등

// 컬렉션 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 데이터를 다루는데 기본적인 메소드들을 정의하고 있음


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>(); // Collectioin의 자료형에서 primitive 타입은 올 수 없음. primitive 타입에 해당하는 class가 존재하니 그것을 사용
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9); // 하나씩 값을 삽입
        System.out.println(integerSet); // 출력해보면 순서가 지켜지지 않는 것을 확인

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New York");
        stringSet.add("LasVegas");
        stringSet.add("San Francisco");
        stringSet.add("Seoul");
        System.out.println(stringSet);

        stringSet.remove("Seoul"); // Seoul을 HashSet에서 제거
        System.out.println(stringSet);

        ArrayList<String> target = new ArrayList<String>();
        target.add("New York");
        target.add("LasVegas"); // 제거할 항목을 ArrayList에 삽임
        stringSet.removeAll(target);
        System.out.println(stringSet);

        System.out.println("LA가 포함되어 있나요? " + stringSet.contains("LA")); // LA가 HashSet에 포함되어 있으면 true, 아니면 false
        System.out.println("LasVegas가 포함되어 있나요? " + stringSet.contains("LasVegas"));

        System.out.println("현재 HashSet의 크기는 : " + stringSet.size() + "입니다."); // HashSet의 크기를 반환

        stringSet.clear(); // HashSet의 모든 아이템들을 삭제
        System.out.println(stringSet);


    }
}