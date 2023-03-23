package org.example;

public class Main {
    public static void main(String[] args) {
        // if 조건문
        int check = 100;
        int num1 = 50;
        if (num1 > check) {
            System.out.println("100보다 큰 수입니다.");
        } else {
            System.out.println("100보다 작은 수 입니다.");
        }

        // switsh문
        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("A등급입니다.");
                break;
            case 'B':
                System.out.println("B등급입니다.");
                break;
            case 'C':
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("C등급보다 낮은 등급입니다.");
                break;
        }

        // 삼항 연산자
        int a = 5;
        String result = (a < 10) ? "10보다 작습니다." : "10보다 큽니다.";
        System.out.println(result);
    }
}