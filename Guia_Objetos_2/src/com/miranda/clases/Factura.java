package com.miranda.clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {
    private UUID uuId;
    private double totalCost;
    private LocalDateTime date;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura() {

    }

    public Factura(Cliente cliente, ItemVenta[] items) {
        this.uuId = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.cliente = cliente;
        this.items = items;
    }


    public UUID getUuId() {
        return uuId;
    }

    public void setUuId(UUID uuId) {
        this.uuId = uuId;
    }

    public double getTotalCost() {
        int i;
        totalCost=0;
        for(i=0; i<this.items.length; i++){
            if(items != null){
                totalCost = totalCost + this.items[i].getUnitPrice();
            }
        }

        return totalCost;
    }

    public double calculateDiscount(){
        double total =getTotalCost();
        if(cliente.getDiscount() == 0){
            System.out.println("No hay descuentos para este cliente");
        }else {
            total -= (total * (cliente.getDiscount() / 100));
        }
        return total;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemVenta[] getItems() {
        return items;
    }

    public void setItems(ItemVenta[] items) {
        this.items = items;
    }


    public String toString() {
        return "------------------------------------------------------------------------------------\n" +
                "Factura numero: " + uuId +  "\nfecha: " + date +"\n"+ cliente +
                "\nitems:\t\t\t\t\t\t\t\tnombre\t\t\tdescripcion\t\t\t precio unitario " + Arrays.toString(items) +
                "Precio total: " + getTotalCost() +
                "\nPrecio con descuento aplicado: " + calculateDiscount() +
                "\n------------------------------------------------------------------------------------";
    }
}
