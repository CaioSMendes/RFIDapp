package com.example.rfidapp.categoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.rfidapp.R;

public class ListcategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcategory);
    }
    //configura a RecyclerView LISTA DINAMICA
    //message_list.LayoutManager = LinearLayout(context: this)
}

