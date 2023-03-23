package org.example;

public class Main {
    public static void main(String[] args) {
        // quiz-1 : 문자 변수 'S', 정수형 변수 10을 선언 및 출력해보기
        char str = 'S';
        int num = 10;
        System.out.println("str: "+ str);
        System.out.println("num: "+ num);

        // quiz-2 : 크기가 3인 정수형 배열을 선언 및 주어진 숫자 3개를 할당하고 배열의 마지막 값을 출력해보기 (숫자 3개 = 10, 20, 30)
        int[] arr = {10,20,30};
        System.out.println(arr[arr.length -1]); // 배열 변수 뒤에 .length로 배열 안 아이템의 갯수 파악 가능
    }
}