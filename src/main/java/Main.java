public class Main {

    public static void main(String[] args) {
        // 반복문
        // for문
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        //  for-each문
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        for (String day : days) {
            System.out.println(day);
        }

        // while문
        int i = 0;
        int newSum = 0;
        while (i < 10) {
            newSum += i + 1;
            i++;
        }
        System.out.println(newSum);

        // while문 + break
        i = 0;
        while (i < 10) {
            if (i == 5) {
                break;
            }
            i++;
        }
        System.out.println(i);

        // for + continue
        for (int j = 0; j < 10; j++) {
            if ( j == 5 ) {
                continue;
            }
            System.out.println(j);
        }

        // do-while 문
        int k = 1;
        int result = 0;
        do {
            result += k;
            k += 1;
        } while ( k < 2); // 조건문 타기 전에 앞의 코드를 먼저 한 번 실행하고 비교함
        System.out.println(result);
    }
}
