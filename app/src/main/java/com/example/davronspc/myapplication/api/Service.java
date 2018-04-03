package com.example.davronspc.myapplication.api;

import com.example.davronspc.myapplication.model.PostModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/posts")
    Call<PostModel> getItems();
}
