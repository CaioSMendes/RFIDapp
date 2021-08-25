package com.example.rfidapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClientesAdapter extends RecyclerView.Adapter<ClientesAdapter.ClienteAdapterVH> {


    @NonNull
    @Override
    public ClienteAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ClienteAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ClienteAdapterVH extends RecyclerView.ViewHolder {
        public ClienteAdapterVH(View itemView) {
            super(itemView);

        }
    }


}

