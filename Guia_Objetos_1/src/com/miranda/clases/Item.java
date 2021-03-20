package com.miranda.clases;

public class Item {
    private int id;
    private String descrpcion;
    private int cantidad;
    private double precioUnitario;

    public Item() {
    }

    public Item(int id, String descrpcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descrpcion = descrpcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", descrpcion='" + descrpcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
