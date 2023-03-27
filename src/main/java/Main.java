import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("text.txt")) {
            // text.txt file에 Hello Wolrd를 출력
            out.write("Hello World".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}