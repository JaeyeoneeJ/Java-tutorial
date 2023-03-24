// 추상 메소드: 설계만 되어 있으며 수행되는 코드에 대해서는 작성이 안 된 메소드
// 상속받는 클래스마다 반드시 동작이 달라지는 경우, 상속받는 클래스 작성자가 반드시 작성하도록 하기 위함
abstract class Bird {
    private int x, y, z;
    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }
}

class Pigeon extends Bird {
    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends Bird {
    @Override
    boolean flyable(int z) {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("-- 비둘기 --");
        pigeon.fly(1,1,3);
        System.out.println("-- 공작새 --");
        peacock.fly(1,1,3);
        System.out.println("-- 비둘기 --");
        pigeon.fly(3,3,30000);
    }
}
