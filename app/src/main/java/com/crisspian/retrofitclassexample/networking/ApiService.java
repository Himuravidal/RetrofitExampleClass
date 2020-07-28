package com.crisspian.retrofitclassexample.networking;

import com.crisspian.retrofitclassexample.model.MarsObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @GET("realestate")
    Call<List<MarsObject>> getMarsData();

}
