import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // 예외가 발생할 가능성이 있는 코드 작성
        } catch (FileNotFoundException e) {
            // FileNotFoundException이 밠갱했을 경우, 처리하기 위한 코드 작성
        } catch (IOException e) {
            // FileNotFoundException이 아닌 IOException이 발생했을 경우, 이를 처리하기 위한 코드 작성
        } finally {
            // 예외의 발생여부에 관계없이 항상 수행되어야 하는 코드 작성
        }
    }
}
