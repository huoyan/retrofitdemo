package supxx.com.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("/login")
    Call<User> login(@Query("username") String username, @Query("password") String password);
}
