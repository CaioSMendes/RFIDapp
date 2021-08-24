package com.example.rfidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.example.rfidapp.API.ApiClient;
import com.example.rfidapp.busca.SearchActivity;
import com.example.rfidapp.carteira.WalletActivity;
import com.example.rfidapp.categoria.CategorieActivity2;
import com.example.rfidapp.cliente.ClientActivity;
import com.example.rfidapp.compra.BuyActivity;
import com.example.rfidapp.configuracao.SettingsActivity;
import com.example.rfidapp.fornecedor.ProviderActivity;
import com.example.rfidapp.produto.ProductActivity;
import com.example.rfidapp.response.CategoriaResponse;
import com.example.rfidapp.venda.SellActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ImageButton categorieImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorieImageButton = findViewById(R.id.buttonProducts);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductActivity.class);
                startActivity(intent);
            }
        });


        categorieImageButton = (ImageButton) findViewById(R.id.buttonCategorie);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategorieActivity2.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonClients);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClientActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonProviders);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProviderActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonBuy);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BuyActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonSell);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SellActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonWallet);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WalletActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonRFID);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonSettings);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });

        categorieImageButton = (ImageButton) findViewById(R.id.buttonLogout);

        categorieImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogoutActivity.class);
                startActivity(intent);
            }
        });

        //RETROFIT AQUI --->  QLQR COISA MUDAR
        Call<List<CategoriaResponse>> categorialist = ApiClient.getCategoriaService().getAllCategories();

        categorialist.enqueue(new Callback<List<CategoriaResponse>>() {
            @Override
            public void onResponse(Call<List<CategoriaResponse>> call, Response<List<CategoriaResponse>> response) {
                if(response.isSuccessful()){
                    Log.e("success",response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<CategoriaResponse>> call, Throwable t) {
                Log.e("fail",t.getLocalizedMessage());
            }
        });
    }
}