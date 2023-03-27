// Collection interface와 자료 구조
// Collection은 모든 자료구조가 구현(implement)하는 인터페이스
// 1. List: 순서가 있는 데이터의 집합이며 데이터의 중복을 허용함 => ArrayList, LinkedList, Stack 등
// 2. Set: 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않음 => HashSet, TreeSet 등
// 3. Map: 키(key)와 값(value)의 쌍으로 이루어진 데이터틔 집합. 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용함 => HashMap, TreeMap 등
// 4. Stack: 마지막에 넣은 데이터를 먼저 꺼내는 자료구조. LIFO(Last In First Out) => Stack, ArrayDeque 등
// 5. Queue: 먼저 넣은 데이터를 먼저 꺼내는 자료구조. FIFO(First In First Out) => Queue, ArrayDeque 등

// 컬렉션 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 데이터를 다루는데 기본적인 메소드들을 정의하고 있음

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Stack 예제
        System.out.println("--  Stack 예제 --");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack); // stack 출력

        System.out.println(stack.peek()); // Stack의 가장 상단 값을 출력(삭제 하지 않음)
        stack.pop(); // Stack의 가장 상단 값을 제거
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.contains(1)); // Stack에 1이라는 값이 있으면 true, 아니면 false
        System.out.println(stack.empty()); // Stack이 비어있으면 true, 아니면 false
        System.out.println(stack);
    }
}