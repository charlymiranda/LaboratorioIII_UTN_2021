package com.miranda.ejercicio1;

import java.awt.*;

public class Circulo {
    private double radio = 1.0;
    private  String color= "rojo";
   // private Color color = Color.red;

    public Circulo() {
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2.0);
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
