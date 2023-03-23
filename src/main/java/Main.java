class Calcuation {
    int add(int x, int y) {
        int result = x + y;
        return result;
    } // 두 값을 더한 결과

    int subtract(int x, int y) {
        int result = x - y;
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        // 메소드 선언과 구현
        Calcuation calcuation = new Calcuation();
        int addResult = calcuation.add(100, 90);
        int subResult = calcuation.subtract(90, 70);

        System.out.println("두 개를 더한 값은 "+addResult + " 입니다.");
        System.out.println("두 개를 뺀 값은 "+subResult + " 입니다.");
    }
}
