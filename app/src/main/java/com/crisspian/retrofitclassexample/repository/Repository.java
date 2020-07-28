package com.crisspian.retrofitclassexample.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.crisspian.retrofitclassexample.model.MarsObject;
import com.crisspian.retrofitclassexample.networking.ApiService;
import com.crisspian.retrofitclassexample.networking.RetrofitClient;

import java.util.List;

import retrofit2.Retrofit;

public class Repository implements Remote{

    private ApiService apiService;
    private List<MarsObject> marsObjectList;
    private MutableLiveData<List<MarsObject>> listMutableLiveData = new MutableLiveData<>();

    public Repository() {
        apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
    }

    @Override
    public LiveData<List<MarsObject>> fetchMarsData() {
        return null;
    }

}
