package com.example.rfidapp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.CategoriaAdapterVH> {


    @NonNull
    @Override
    public CategoriaAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CategoriaAdapterVH extends RecyclerView.ViewHolder {
        // O QUE VAI APARECER NA LISTVIEW
        TextView nomeCat;
        TextView codCat;
        public CategoriaAdapterVH(View itemView) {
            super(itemView);

        }
    }


}