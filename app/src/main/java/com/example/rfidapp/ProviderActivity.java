package com.example.rfidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProviderActivity extends AppCompatActivity {

    ImageButton providerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);

        providerButton = findViewById(R.id.buttonCadfornecedor);

        providerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadproviderActivity.class);
                startActivity(intent);
            }
        });

        providerButton = findViewById(R.id.buttonListfornecedor);

        providerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListproviderActivity.class);
                startActivity(intent);
            }
        });

    }
}