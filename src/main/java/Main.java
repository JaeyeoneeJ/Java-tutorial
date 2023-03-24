class Parent {
    int num;
    Parent(){
        num = 10;
    }
    Parent(int n) {
        num = n;
    }
}

class Child extends Parent {
    int num2;
    Child() {
//        super(40); // 주석 처리된 채 실행하면 해당 라인에 자동으로 super() 구문을 삽입해 변수 num은 10으로 초기화 됨
        num2 = 20;
    }
    void display() {
        System.out.println(num);
        System.out.println(num2);
    }
}
public class Main {

    public static void main(String[] args) {
        // super 키워드 연습
        Child child = new Child();
        child.display();
    }
}
