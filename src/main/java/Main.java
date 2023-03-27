// Collection interface와 자료 구조
// Collection은 모든 자료구조가 구현(implement)하는 인터페이스
// 1. List: 순서가 있는 데이터의 집합이며 데이터의 중복을 허용함 => ArrayList, LinkedList, Stack 등
// 2. Set: 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않음 => HashSet, TreeSet 등
// 3. Map: 키(key)와 값(value)의 쌍으로 이루어진 데이터틔 집합. 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용함 => HashMap, TreeMap 등
// 4. Stack: 마지막에 넣은 데이터를 먼저 꺼내는 자료구조. LIFO(Last In First Out) => Stack, ArrayDeque 등
// 5. Queue: 먼저 넣은 데이터를 먼저 꺼내는 자료구조. FIFO(First In First Out) => Queue, ArrayDeque 등

// 컬렉션 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 데이터를 다루는데 기본적인 메소드들을 정의하고 있음

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        // ArrayDeque 예제
        System.out.println("-- ArrayDeque 예제 --");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); // ArrayDeque를 이용한 선언(제네릭스 이용)
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4); // arrayDeque의 앞에 값을 삽입

        System.out.println(arrayDeque);

        arrayDeque.addLast(0); // arrayDeque의 끝에 값을 삽입
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10); // addFirst와 비슷하지만 큐의 크기 문제가 생길 때, offerFirst는 false를, addFirst는 exception을 반환
        System.out.println(arrayDeque);

        arrayDeque.offerLast(-1); // arrayDeque의 끝에 값을 삽입
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size()); // 7

        System.out.println(arrayDeque.removeFirst()); // 첫번째 값을 제거하면서 그 값을 리턴
        System.out.println(arrayDeque.removeLast()); // 마지막 값을 제거하면서 그 값을 리턴
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size()); // 5

        System.out.println(arrayDeque.pollFirst()); // 첫번째 값을 반환 및 제거하면서 그 값을 리턴
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size()); // 4

        System.out.println(arrayDeque. pollLast()); // 마지막 값을 반환 및 제거하면서 그 값을 리턴
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size()); // 3

        System.out.println(arrayDeque.peekFirst()); // 첫번째 값을 반환, 제거하지 않음
        System.out.println(arrayDeque.peekLast()); // 마지막 값을 반환, 제거하지 않음
        System.out.println(arrayDeque.size()); // 3
    }
}