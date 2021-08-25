package com.example.rfidapp.services;

import com.example.rfidapp.response.FornecedorResponse;
import com.example.rfidapp.response.ProdutoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProdutoService {
    @GET("products/")
    Call<List<ProdutoResponse>> getAllProducts();
}
