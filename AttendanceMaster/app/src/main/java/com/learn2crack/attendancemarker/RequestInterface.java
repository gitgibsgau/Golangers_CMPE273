package com.learn2crack.attendancemarker;

import com.learn2crack.attendancemarker.models.ServerResponse;
import com.learn2crack.attendancemarker.models.ServerRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
