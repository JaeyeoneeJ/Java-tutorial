// Retrofit 라이브러리 실습


import retrofit2.Call;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Retrofit 라이브러리 실습 --");
        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2); // 2페이지를 확인할 것이므로 2을 삽입
        // Call은 retrofit 라이브러리의 인터페이스이며 서버에서 응답하는 값을 담는 역할을 함
        try {
            System.out.println(retrofitTest.execute().body()); // 서버에서 받은 데이터를 확인
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
