import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("/api/users/")
    Call<Object> retrofitTest(@Query("page") int page);
}
// @Query는 Retrofit 라이브러리를 이용할 때 쿼리스트링을 입력하는 방법임
// 이렇게 파라미터 변수로 작성해놓으면 함수를 호출할 때 파라미터를 바꿔가며 원하는 페이지를 조회할 수 있음
