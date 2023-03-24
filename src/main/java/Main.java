import pkg.ModifierTest;

class Child extends ModifierTest {
    void callParentProtectedMember() {
        System.out.println("Call my parent's protected method");
        super.messageProtected();
    }
}

public class Main {
    public static void main(String[] args) {
        // 접근 제어자 (access modifier): 멤버 변수/함수 혹은 클래스에 사용되며 외부에서의 접근을 제한하는 역할을 함
        // - private: 같은 클래스 내에서만 접근이 가능함
        // - default(nothing): 같은 패키지 내에서만 접근이 가능함
        // - protected: 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능함
        // - public: 접근 제한이 전혀 없음

        // 접근 제어자를 사용하는 이유
        // - 객체지향 프로그래밍이란 객체들 간의 상호작용을 코드로 표현하는 것
        // - 이때 객체들간의 관계에 따라 접근할 수 있는 것과 아닌 것, 권한을 구분할 필요가 생김
        // - 클래스 내부에서 선언된 데이터의 부적절한 사용으로부터 보호하기 위함. 이를 캡슐화라고 함
        // - 접근 제어자는 캡슐화가 가능할 수 있도록 돕는 도구임

        ModifierTest modifierTest = new ModifierTest();

        modifierTest.messageOutside();
//        modifierTest.messageInside(); // compile error
//        modifierTest.messageProtected(); // compile error

        Child child = new Child();
        child.callParentProtectedMember();

    }
}
