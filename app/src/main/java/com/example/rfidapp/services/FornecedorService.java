package com.example.rfidapp.services;

import com.example.rfidapp.response.ClienteResponse;
import com.example.rfidapp.response.FornecedorResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FornecedorService {
    @GET("providers/")
    Call<List<FornecedorResponse>> getAllProviders();
}
