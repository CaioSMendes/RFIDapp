package com.example.rfidapp.response;

public class CategoriaResponse {
    private String name;
    private String codCategorie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodCategorie() {
        return codCategorie;
    }

    public void setCodCategorie(String codCategorie) {
        this.codCategorie = codCategorie;
    }

    @Override
    public String toString() {
        return "CategoriaResponse{" +
                "name='" + name + '\'' +
                ", codCategorie='" + codCategorie + '\'' +
                '}';
    }
}

