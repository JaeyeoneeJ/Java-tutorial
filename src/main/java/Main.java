// 인터페이스: 객체의 특정 행동의 특징을 정의하는 간단한 문법, 함수의 특징인 접근 제어자, 리턴 타입, 메소드 이름 만을 정의함(함수의 내용 없음)

interface Bird {
    void fly(int x, int y, int z);
}

class Pigeon implements Bird {
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("날아갑니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }
    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }
}


public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1,2,3);
//        bird.printLocation(); // compile error
    }
}
