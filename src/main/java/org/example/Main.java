package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int num = 5; // 정수형 변수 선언
        // 세미콜론(;)을 문장 끝에 붙이지 않으면 컴파일 오류 남 ㅋ
//        System.out.println(num);
//
//        String string = "Hello World!"; // 문자형 변수 선언
//        System.out.println(string);
//
//        string = "Goodbye World!"; // 이미 선언된 변수에 다른 값을 할당
//        System.out.println(string);
//
//        final int num2 = 10; // 상수형 변수 선언하System.out.println(num);
////
////        String string = "Hello World!"; // 문자형 변수 선언
////        System.out.println(string);
////
////        string = "Goodbye World!"; // 이미 선언된 변수에 다른 값을 할당
////        System.out.println(string);
////
////        final int num2 = 10; // 상수형 변수 선언하기
////        System.out.println(num2);기
//        System.out.println(num2);
        // num2 = 50; // error: cannot assign a value to final variable num2. 상수이기 때문!

        // 숫자 기본 자료형 알아보기
//        short s = 1;
//        System.out.println(s);
//
//        int a = 3; // 정수형 변수 선언
//        System.out.println(a);
//
//        long b = 1234567890L; // Long 정수형 변수 선언
//        System.out.println(b);
//
//        float c = 5.5F; // float 실수형 변수 선언
//        System.out.println(c);
//
//        double d = 9.12345678901234567890d; // double 실수형 변수 선언
//        System.out.println(d);
//
//        // 다음처럼 각 자료형의 MAX, MIN 값을 가져올 수 있음
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);

        // 문자 기본 자료형 알아보기
//        char alphabet = 'A'; // 문자형 변수 선언
//        System.out.println(alphabet);
        // char type은 default 값이 없음

        // 논리 기본 자료형
//        boolean fact = true; // 논리형 변수는 true, false의 값을 가진다.
//        System.out.println(fact);
        // boolean type은 default 값이 없음

        // 바이트 기본 자료형
//        byte data = 'd';
//        System.out.println(data); // 알파벳 d는 ASCII code에서 십진법으로 100이기 때문에 100이라는 글자가 출력됨

        // 참조 자료형 : 자바에서는 기본 자료형이 아닌 모든 것을 참조 자료형이라고 함. 자바의 인스턴스를 가리킬 수 있는 자료형임

//        String newString = "Noooo!!";
//        System.out.println(newString);
//
//        int[] intArray = new int[] {1,2,3,4,5}; // int 배열을 선언과 동시에 초기화
//        System.out.println(Arrays.toString(intArray));

        // 배열 : 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조
//        int[] intEmptyArray = new int[5]; // int의 5자리 배열 선언
//        System.out.println(Arrays.toString(intEmptyArray)); // int의 default 값 0으로 채워짐

        int[] intArray = new int[] {1,2,3,4,5}; // int 배열을 선언과 동시에 초기화
        System.out.println(Arrays.toString(intArray));

//        String[] stringEmptyArray = new String[5]; // 참조자료형 String의 5자리 배열 선언
//        System.out.println(Arrays.toString(stringEmptyArray)); // 참조자료형은 값이 없을 경우 null로 표현

//        String[] months = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
//        System.out.println(Arrays.toString(months));

        int[] scores = new int[4];
        scores[0] = 5; // 인덱스를 통해 배열에 값 입력
        scores[1] = 10;
        System.out.println(scores[0]); // 인덱스를 통해 배열의 특정 값 출력

        String[] months = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
        System.out.println(months[7]); // 인덱스를 통해 배열의 특정 값 출력

//        int[][] arr = new int[4][3]; // 배열을 활용하여 2차원의 배열도 만들 수 있음
    }
}