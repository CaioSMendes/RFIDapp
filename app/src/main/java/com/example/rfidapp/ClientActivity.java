package com.example.rfidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ClientActivity extends AppCompatActivity {

    ImageButton clientButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        clientButton = findViewById(R.id.buttonCadcliente);

        clientButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadclientActivity.class);
                startActivity(intent);
            }
        });

        clientButton = findViewById(R.id.buttonListclient);

        clientButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListclientActivity.class);
                startActivity(intent);
            }
        });
    }
}