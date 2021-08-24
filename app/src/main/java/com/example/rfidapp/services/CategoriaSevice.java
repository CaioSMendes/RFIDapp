package com.example.rfidapp.services;

import com.example.rfidapp.response.CategoriaResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoriaSevice {

    @GET("categories/")
    Call<List<CategoriaResponse>> getAllCategories();
}
