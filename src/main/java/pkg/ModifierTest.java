package pkg;

public class ModifierTest {
    private void messageInside() {
        System.out.println("This is private modifier");
    }

    public void messageOutside() {
        System.out.println("This is public modifier");
        messageInside();
    }

    protected void messageProtected() {
        System.out.println("This is protected modifier");
    }
}
