import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    // try-with-resource 형식
//    public static void main(String[] args) {
//        try (FileOutputStream out = new FileOutputStream("text.txt")) {
//            // text.txt file에 Hello Wolrd를 출력
//            out.write("Hello World".getBytes());
//            out.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    // try-catch 형식
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("test.txt");
        try {
            // test.txt file에 Hello World를 출력
            out.write("Hello World!".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }
}