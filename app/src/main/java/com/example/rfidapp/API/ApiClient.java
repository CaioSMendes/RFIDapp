package com.example.rfidapp.API;
import com.example.rfidapp.services.CategoriaSevice;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit getRetrofit(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("http://api.larntech.net/") //original
                .baseUrl("https://api-tcc-rifd.herokuapp.com/v1/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;
    }

    public static CategoriaSevice getCategoriaService(){
        CategoriaSevice categoriaSevice = getRetrofit().create(CategoriaSevice.class);

        return categoriaSevice;
    }
}
