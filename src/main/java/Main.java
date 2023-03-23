public class Main {

    public static void main(String[] args) {
        // 반복문 quiz-1 : 1부터 100까지의 합을 구하는 반복문 코드를 작성해보자
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("quiz-1: " + result);

        // 반복문 quiz-2: 5초부터 시작하는 카운트다운을 반복문을 사용해서 만들어보자
        for (int i = 5; i >= 0; i--) {
            System.out.println("quiz-2: 카운트다운: " + i);
        }

        // 조건문 & 반복문 quiz-3: 1부터 30까지 홀수의 합과 짝수의 합을 구하고 각각 출력하게 하기
        int sumOddNum = 0;
        int sumEvenNum = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                sumEvenNum += i;
            } else {
                sumOddNum += i;
            }
        }
        System.out.println("quiz-3: 홀수 합: "+sumOddNum);
        System.out.println("quiz-3: 짝수 합: "+sumEvenNum);
    }
}
