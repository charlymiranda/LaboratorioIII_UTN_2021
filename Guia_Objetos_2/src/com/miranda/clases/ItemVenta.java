package com.miranda.clases;

import java.util.UUID;

public class ItemVenta {
    private UUID uuId;
    private String name;
    private String description;
    private double unitPrice;

    public ItemVenta() {
    }

    public ItemVenta(String name, String description, double unitPrice) {
        this.uuId = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }


    public UUID getUuId() {
        return uuId;
    }

    public void setUuId(UUID uuId) {
        this.uuId = uuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String toString() {
        return "\n" + uuId + " ||\t "+ name +"\t " + "\t " + description + "\t\t\t\t " + unitPrice +"\n";
    }
}
