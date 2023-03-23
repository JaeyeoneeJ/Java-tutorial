class Phone { // 클래스 선언
    String model;
    String color;
    int price;
}

public class Main {

    public static void main(String[] args) {
        // 클래스
        Phone galaxy = new Phone(); // 같은 클래스로 각기 다른 인스턴스 생성
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone = new Phone(); // 같은 클래스로 각기 다른 인스턴스 생성
        iphone.model = "iPhoneX";
        iphone.color = "White";
        iphone.price = 200;

        System.out.println("철수는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
    }
}
