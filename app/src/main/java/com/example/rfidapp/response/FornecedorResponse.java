package com.example.rfidapp.response;

public class FornecedorResponse {
    private String corporateName;
    private String fantasyName;
    private String phone;
    private String cnpj;
    private String stateRegistration;
    private String email;
    private String business;
    private String codeProvider;
    private String city_address;
    private String street_address;
    private String neighborhood_address;
    private String number_address;
    private String complement_address;
    private String state_address;
    private String zipcode_address;

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getCodeProvider() {
        return codeProvider;
    }

    public void setCodeProvider(String codeProvider) {
        this.codeProvider = codeProvider;
    }

    public String getCity_address() {
        return city_address;
    }

    public void setCity_address(String city_address) {
        this.city_address = city_address;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getNeighborhood_address() {
        return neighborhood_address;
    }

    public void setNeighborhood_address(String neighborhood_address) {
        this.neighborhood_address = neighborhood_address;
    }

    public String getNumber_address() {
        return number_address;
    }

    public void setNumber_address(String number_address) {
        this.number_address = number_address;
    }

    public String getComplement_address() {
        return complement_address;
    }

    public void setComplement_address(String complement_address) {
        this.complement_address = complement_address;
    }

    public String getState_address() {
        return state_address;
    }

    public void setState_address(String state_address) {
        this.state_address = state_address;
    }

    public String getZipcode_address() {
        return zipcode_address;
    }

    public void setZipcode_address(String zipcode_address) {
        this.zipcode_address = zipcode_address;
    }

    @Override
    public String toString() {
        return "FornecedorResponse{" +
                "corporateName='" + corporateName + '\'' +
                ", fantasyName='" + fantasyName + '\'' +
                ", phone='" + phone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", stateRegistration='" + stateRegistration + '\'' +
                ", email='" + email + '\'' +
                ", business='" + business + '\'' +
                ", codeProvider='" + codeProvider + '\'' +
                ", city_address='" + city_address + '\'' +
                ", street_address='" + street_address + '\'' +
                ", neighborhood_address='" + neighborhood_address + '\'' +
                ", number_address='" + number_address + '\'' +
                ", complement_address='" + complement_address + '\'' +
                ", state_address='" + state_address + '\'' +
                ", zipcode_address='" + zipcode_address + '\'' +
                '}';
    }
}
