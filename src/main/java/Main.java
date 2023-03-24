class Animal {
    String name;
    String color;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }
    public void cry() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        // 오버로딩: 한 클래스 내에 동일한 이름의 메소드를 여러개 정의하는 것, 기존에 없는 새로운 메소드를 정의하는 것
        // 오버로딩의 조건
        // - 메소드 이름이 동일해야 함
        // - 매개변수의 개수 혹은 타입이 달라야 함

        // 오버라이딩: 부모 클래스로부터 상속받은 메소드의 내용을 변경하는 것
        // 상속받은 메소드를 그대로 사용하기도 하지만, 필요에 의해 변경해야할 경우 오버라이딩을 함
        // 오버라이딩의 조건
        // - 부모 클래스의 메소드와 이름이 같아야 함
        // - 부모 클래스의 메소드와 매개변수가 같아야 함
        // - 부모 클래스의 메소드와 반환타입이 같아야 함
        Animal dog = new Dog("코코");
        dog.cry();
    }
}
