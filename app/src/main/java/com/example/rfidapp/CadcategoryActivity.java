package com.example.rfidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.rfidapp.data.network.Categoria;
import com.example.rfidapp.data.network.JsonPlaceHolderApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CadcategoryActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadcategory);

        textViewResult = findViewById(R.id.IDnameCat);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-tcc-rifd.herokuapp.com/v1/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //JsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        //createCategoria();

        //private void createCategoria(){
            //Categoria categoria = new Categoria(name);
        //}


    }
}