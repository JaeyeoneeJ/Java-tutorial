import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 스트림 예제4: reducer를 이용한 계산
        System.out.println("-- 스트림 예제4 --");
        List<Integer> numArr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result = numArr.stream().reduce(0, Integer::sum); // reduce와 sum을 활용하여 1부터 10까지 더하게 됨
        System.out.println(result);
    }
}
