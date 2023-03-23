package org.example;

public class Main {
    public static void main(String[] args) {
        // quiz: 결과 값 추측해보기
        int num1 = 10;
        int num2 = 3;
        boolean bool1 = true;
        boolean bool2 = false;
        num1 += num1;
        num2 *= num1;
        System.out.println(num1); // 20
        System.out.println(num2); // 60
        System.out.println(bool1 && bool2); // false
    }
}