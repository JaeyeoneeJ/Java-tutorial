import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}

public class Main {

    public static void main(String[] args) {
        // 스트림 예제3: map 연산 활용
        System.out.println("-- 스트림 예제3 --");
        List<Sale> saleList = Arrays.asList(
                new Sale("Apple", 5000, 0.05f),
                new Sale("Grape", 3000, 0.1f),
                new Sale("Orange", 4000, 0.02f),
                new Sale("Tangerine", 2000, 0)
        );

        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price * (1-sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실 구매가: " + pair.getRight() + "원 "));
    }
}
