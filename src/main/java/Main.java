// 예외처리 Quiz
// divide() 함수는 매개변수(parameter)에 들어오는 값에 따라서 ArithmeticException과 ArrayIndexOutOfBoundsException이 발생할 수 있음
// 1. throws 키워드를 통해 divide() 함수에서 발생할 수 있는 exception의 종류가 무엇인지 알게 하라
// 2. Main 함수에서 try-catch 문을 이용해서, 다음 동작을 구현해라
//  - ArithmeticException이 발생할 때는 잘못된 계산임을 알리는 문구를 출력하라
//  - ArrayIndexOutOfBoundsException이 발생할 때는 현재 배열의 Index 범위를 알려주는 문구를 출력하라

class ArrayCalculation {
    int[] arr = {0,1,2,3,4};

    public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        System.out.println("2 / 1 = " + arrayCalculation.divide(2,1));
        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1,0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("잘못된 계산입니다. " + arithmeticException.getMessage());
        }

        try {
            System.out.println("Try to divide using out of index element = " + arrayCalculation.divide(5,0));
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("잘못된 index 범위로 나누었습니다. 타당 index 범위는 0부터 " + (arrayCalculation.arr.length - 1) + "까지 입니다.");
        }
    }
}