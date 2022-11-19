package kr.ac.dankook.dantumproject;

import java.util.List;

import kr.ac.dankook.dantumproject.issue.Issues;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("users/1")
    Call<User> getPosts();

    @GET("주소")
    Call<List<Issues>> getIssues();
}
