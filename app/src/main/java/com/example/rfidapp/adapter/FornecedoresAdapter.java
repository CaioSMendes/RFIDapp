package com.example.rfidapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FornecedoresAdapter extends RecyclerView.Adapter<FornecedoresAdapter.FornecedorAdapterVH> {


    @NonNull
    @Override
    public FornecedorAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FornecedorAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FornecedorAdapterVH extends RecyclerView.ViewHolder {
        public FornecedorAdapterVH(View itemView) {
            super(itemView);

        }
    }


}

