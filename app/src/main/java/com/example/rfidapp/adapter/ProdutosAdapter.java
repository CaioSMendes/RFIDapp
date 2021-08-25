package com.example.rfidapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ProdutoAdapterVH> {


    @NonNull
    @Override
    public ProdutoAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProdutoAdapterVH extends RecyclerView.ViewHolder {
        public ProdutoAdapterVH(View itemView) {
            super(itemView);

        }
    }


}
