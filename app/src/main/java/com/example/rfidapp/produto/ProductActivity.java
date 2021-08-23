package com.example.rfidapp.produto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rfidapp.R;
import com.example.rfidapp.produto.CadproductActivity;
import com.example.rfidapp.produto.ListproductActivity;

public class ProductActivity extends AppCompatActivity {

    ImageButton productButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        productButton = findViewById(R.id.buttonCadproduto);

        productButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadproductActivity.class);
                startActivity(intent);
            }
        });

        productButton = findViewById(R.id.buttonListproduto);

        productButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListproductActivity.class);
                startActivity(intent);
            }
        });
    }
}