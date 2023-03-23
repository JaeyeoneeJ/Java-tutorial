import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 조건문 quiz-1 : 입력받은 점수가 무슨 등급인지 출력
        // 100~91점: A등급
        // 90~81점: B등급
        // 80~71점: C등급
        // 그 외: F등급

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score <= 100 && score > 90) {
            System.out.println("A등급");
        } else if (score <= 90 && score > 80) {
            System.out.println("B등급");
        } else if (score <= 80 && score > 70) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }
    }
}
