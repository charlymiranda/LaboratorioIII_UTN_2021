package com.miranda.clases;

import java.util.UUID;

public class ClienteCuenta {
    private UUID uuID;
    private String nombre;
    private char genero;// f o m

    public ClienteCuenta() {
    }

    public ClienteCuenta(String nombre, char genero) {
        this.uuID = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getUuID() {
        return uuID;
    }

    public void setUuID(UUID uuID) {
        this.uuID = uuID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteCuenta{" +
                "Id del Cliente=" + uuID +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
