package com.example.rfidapp.services;

import com.example.rfidapp.response.CategoriaResponse;
import com.example.rfidapp.response.ClienteResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ClienteService {
    @GET("clients/")
    Call<List<ClienteResponse>> getAllClientes();
}
