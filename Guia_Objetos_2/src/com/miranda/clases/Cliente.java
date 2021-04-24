package com.miranda.clases;

import java.util.UUID;

public class Cliente {

    private String uuId;
    private String name;
    private String email;
    private double discount;

    public Cliente() {
    }

    public Cliente(String name, String email, double discount) {
        this.uuId = UUID.randomUUID().toString().substring(0, 10);
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public String toString() {
        return  "\nID Cliente: " + uuId +
                " NAME: " + name +
                " EMAIL: " + email +
                " DISCOUNT: " + discount + "%";
    }
}
