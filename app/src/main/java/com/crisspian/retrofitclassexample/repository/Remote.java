package com.crisspian.retrofitclassexample.repository;

import androidx.lifecycle.LiveData;

import com.crisspian.retrofitclassexample.model.MarsObject;

import java.util.List;

public interface Remote {
    LiveData<List<MarsObject>> fetchMarsData();
}
