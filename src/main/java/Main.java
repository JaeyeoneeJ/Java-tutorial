// Collection interface와 자료 구조
// Collection은 모든 자료구조가 구현(implement)하는 인터페이스
// 1. List: 순서가 있는 데이터의 집합이며 데이터의 중복을 허용함 => ArrayList, LinkedList, Stack 등
// 2. Set: 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않음 => HashSet, TreeSet 등
// 3. Map: 키(key)와 값(value)의 쌍으로 이루어진 데이터틔 집합. 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용함 => HashMap, TreeMap 등
// 4. Stack: 마지막에 넣은 데이터를 먼저 꺼내는 자료구조. LIFO(Last In First Out) => Stack, ArrayDeque 등
// 5. Queue: 먼저 넣은 데이터를 먼저 꺼내는 자료구조. FIFO(First In First Out) => Queue, ArrayDeque 등

// 컬렉션 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 데이터를 다루는데 기본적인 메소드들을 정의하고 있음


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10); // ArrayList에 값 한개씩 입력
        System.out.println(list); // [1,5,4,11,10]

        Collections.sort(list); // list 정렬
        System.out.println(list); // [1,4,5,10,11]

        System.out.println(list.size()); // arrayList의 크기 출력

        list.remove(4); // 인덱스를 활용하여 해당 값 제거
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // get을 이용하여 값 1개씩 출력
        }
        for (Object current : list) {
            System.out.println(current);
        }
    }
}