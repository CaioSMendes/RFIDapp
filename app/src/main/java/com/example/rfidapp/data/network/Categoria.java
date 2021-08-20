package com.example.rfidapp.data.network;

import com.google.gson.annotations.SerializedName;

public class Categoria {

    private String name;
    @SerializedName("body")
    private String codCategorie;

    public Categoria(String name, String codCategorie) {
        this.name = name;
        this.codCategorie = codCategorie;
    }

    public String getName() {
        return name;
    }

    public String getCodCategorie() {
        return codCategorie;
    }

}