class Animal {
    String name;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal { // 상속 받을 때, 오직 하나의 클래스만을 상속받을 수 있음

    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }
}
public class Main {

    public static void main(String[] args) {
        // 클래스 상속
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

        Animal dog2 = dog;
        dog2.cry();
//        dog2.swim(); // compile error, 자식 타입에 있는 swim()을 호출할 수 없음
    }
}
