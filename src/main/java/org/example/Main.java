package org.example;

public class Main {
    public static void main(String[] args) {
        // 세미콜론(;)을 문장 끝에 붙이지 않으면 컴파일 오류 남 ㅋ
        int num = 5; // 정수형 변수 선언
        System.out.println(num);

        String string = "Hello World!"; // 문자형 변수 선언
        System.out.println(string);

        string = "Goodbye World!"; // 이미 선언된 변수에 다른 값을 할당
        System.out.println(string);

        final int num2 = 10; // 상수형 변수 선언하기
        System.out.println(num2);
        // num2 = 50; // error: cannot assign a value to final variable num2. 상수이기 때문!

    }
}