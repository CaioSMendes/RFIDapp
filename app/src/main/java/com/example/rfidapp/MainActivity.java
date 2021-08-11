package com.example.rfidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

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


    }
}