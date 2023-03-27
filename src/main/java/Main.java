// 객체지향 quiz
// 요구사항
// - 사람은 자식, 부모님, 조부모님이 있다.
// - 모든 사람은 이름, 나이, 현재 장소 정보(x,y 좌표)가 있다.
// - 모든 사람은 걸을 수 있다. 장소(x,y 좌표)로 이동한다.
// - 자식과 부모님은 뛸 수 있다. 장소(x,y 좌표)로 이동한다.
// - 조부모님의 기본 속도는 1이다. 부모의 기본속도는 3, 자식은 5이다.
// - 뛸때는 속도가 기본 속도 대비 +2 빠르다.
// - 수영할때는 속도가 기본 속도 대비 +1 빠르다.
// - 자식만 수영을 할 수 있다. 장소(x,y 좌표)로 이동한다.

// 조건
// - 모든 종류의 사람의 인스턴스는 1개씩 생성한다.
// - 모든 사람의 처음 위치는 x,y 좌표가 (0,0)이다.
// - 모든 사람의 이름, 나이, 속도, 현재 위치를 확인한다.
// - 걸을 수 있는 모든 사람이 (1,1) 위치로 걷는다.
// - 뛸 수 있는 모든 사람은 (2,2) 위치로 뛰어간다.
// - 수영할 수 있는 모든 사람은 (3, -1) 위치로 수영해서 간다.

public class Main {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("할아버지", 70);
        Human parent = new Parent("엄마", 50);
        Human child = new Child("나", 20);

        Human[] humans = {grandParent, parent, child};
        for (Human human : humans) {
            System.out.println(human.name + ", 나이: " + human.age + ", 속도: " + human.speed + ", 장소: " + human.getLocation());
        }
        System.out.println("<활동 시작>");
        for (Human human : humans) {
            if (human instanceof Walkable) {
                ((Walkable) human).walk(1,1);
                System.out.println(" - - - - - - - ");
            }
            if (human instanceof Runnable) {
                ((Runnable) human).run(2, 2);
                System.out.println(" - - - - - - - ");
            }
            if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
                System.out.println(" - - - - - - - ");
            }
        }
    }
}
