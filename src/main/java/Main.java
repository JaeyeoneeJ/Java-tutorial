class Phone {
    String model;
    String color;
    int price;

    Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
public class Main {

    public static void main(String[] args) {
        // 생성자
        Phone galaxy = new Phone("Galaxy10", "Black",100); // 같은 클래스로 각기 다른 인스턴스 생성
        Phone iphone = new Phone("iPhoneX", "White", 200); // 같은 클래스로 각기 다른 인스턴스 생성

        System.out.println("철수는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
    }
}
