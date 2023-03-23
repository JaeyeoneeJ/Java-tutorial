package org.example;

public class Main {
    public static void main(String[] args) {
        // 산술 연산자
        int num1 = 10;
        int num2 = 4;

        System.out.println("더하기 연산: " + (num1 + num2));
        System.out.println("빼기 연산: " + (num1 - num2));
        System.out.println("곱하기 연산: " + (num1 * num2));
        System.out.println("나누기 연산: " + (num1 / num2));
        System.out.println("나머지 연산: " + (num1 % num2));

        // 대입 연산자
        num1 += num2; // num1 = num1 + num2
        System.out.println("num1 += num2, num1 = "+num1);

        num1 -= num2; // num1 = num1 - num2
        System.out.println("num1 -= num2, num1 = "+num1);

        num1 *= num2; // num1 = num1 * num2
        System.out.println("num1 *= num2, num1 = "+num1);

        num1 /= num2; // num1 = num1 / num2
        System.out.println("num1 /= num2, num1 = "+num1);

        num1 %= num2; // num1 = num1 % num2
        System.out.println("num1 %= num2, num1 = "+num1);

    }
}