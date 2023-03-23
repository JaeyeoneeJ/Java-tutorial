package org.example;

public class Main {
    public static void main(String[] args) {
        // 관계 연산자
//        int num1 = 10;
//        int num2 = 20;
//        int num3 = 10;
//
//        System.out.println(num1 > num2); // 10 > 20
//        System.out.println(num1 >= num3); // 10 >= 10
//        System.out.println(num1 < num2); // 10 < 20
//        System.out.println(num1 <= num2); // 10 <= 20
//        System.out.println(num1 == num3); // 10 == 10
//        System.out.println(num1 != num2); // 10 != 20

        // 논리 연산자
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // &&: 둘 다 참일 경우 true, 아닐 경우 false
        System.out.println(a || b); // ||: 둘 다 거짓일 경우 false, 아닐 경우 true
        System.out.println(!b); // !: 피연산자의 논리 값을 바꿈(true <=> false)


    }
}