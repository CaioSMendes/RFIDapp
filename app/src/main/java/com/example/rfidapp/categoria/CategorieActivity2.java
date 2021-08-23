package com.example.rfidapp.categoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rfidapp.R;

public class CategorieActivity2 extends AppCompatActivity {

    ImageButton categorieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);

        categorieButton = findViewById(R.id.buttonCadcategoria);

        categorieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CadcategoryActivity.class);
                startActivity(intent);
            }
        });

        categorieButton = findViewById(R.id.buttonListcategoria);

        categorieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListcategoryActivity.class);
                startActivity(intent);
            }
        });
    }


}