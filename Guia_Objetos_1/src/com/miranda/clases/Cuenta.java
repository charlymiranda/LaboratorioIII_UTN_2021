package com.miranda.clases;

public class Cuenta {
    private int id;
    private String nombre;
    private double balance;

    public Cuenta() {
    }

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double credito(double credito){
        return this.balance += credito;
    }

    public double debito(double debito){
        if(this.balance>debito){
            this.balance-=debito;
        }else{
            System.out.println("No hay suficiente dinero para esa extraccion");
        }
        return balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
