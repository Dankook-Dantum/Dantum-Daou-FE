package kr.ac.dankook.dantumproject;

import java.util.List;

import kr.ac.dankook.dantumproject.issue.Issues;
import kr.ac.dankook.dantumproject.profile.User;
import kr.ac.dankook.dantumproject.profile.Users2;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("users/6")
    Call<User> getUsers();

    @GET("users/detail/6")
    Call<Users2> getUsers2();

    @GET("주소")
    Call<List<Issues>> getIssues();

    @GET("votes/:1")
    Call<List<voteList>> getVoteList();

}
