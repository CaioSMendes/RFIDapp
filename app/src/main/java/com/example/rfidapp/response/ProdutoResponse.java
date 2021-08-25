package com.example.rfidapp.response;

import org.w3c.dom.Text;

public class ProdutoResponse {
    private String name;
    private Text description; //text
    private int quantity;
    private String unity;
    private float price;
    private String date; //data
    private String gtin;
    private String rfid;
    private int productMax;
    private float salePrice;
    private float saleCost;
    private String avaliable;
    private String name_categorie;
    private String cod_categorie;
    private String corporateName_provider;
    private String fantasyName_provider;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public int getProductMax() {
        return productMax;
    }

    public void setProductMax(int productMax) {
        this.productMax = productMax;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public float getSaleCost() {
        return saleCost;
    }

    public void setSaleCost(float saleCost) {
        this.saleCost = saleCost;
    }

    public String getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(String avaliable) {
        this.avaliable = avaliable;
    }

    public String getName_categorie() {
        return name_categorie;
    }

    public void setName_categorie(String name_categorie) {
        this.name_categorie = name_categorie;
    }

    public String getCod_categorie() {
        return cod_categorie;
    }

    public void setCod_categorie(String cod_categorie) {
        this.cod_categorie = cod_categorie;
    }

    public String getCorporateName_provider() {
        return corporateName_provider;
    }

    public void setCorporateName_provider(String corporateName_provider) {
        this.corporateName_provider = corporateName_provider;
    }

    public String getFantasyName_provider() {
        return fantasyName_provider;
    }

    public void setFantasyName_provider(String fantasyName_provider) {
        this.fantasyName_provider = fantasyName_provider;
    }

    @Override
    public String toString() {
        return "ProdutoResponse{" +
                "name='" + name + '\'' +
                ", description=" + description +
                ", quantity=" + quantity +
                ", unity='" + unity + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", gtin='" + gtin + '\'' +
                ", rfid='" + rfid + '\'' +
                ", productMax=" + productMax +
                ", salePrice=" + salePrice +
                ", saleCost=" + saleCost +
                ", avaliable='" + avaliable + '\'' +
                ", name_categorie='" + name_categorie + '\'' +
                ", cod_categorie='" + cod_categorie + '\'' +
                ", corporateName_provider='" + corporateName_provider + '\'' +
                ", fantasyName_provider='" + fantasyName_provider + '\'' +
                '}';
    }
}