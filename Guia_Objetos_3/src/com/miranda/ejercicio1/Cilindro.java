package com.miranda.ejercicio1;

public class Cilindro extends Circulo{

    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double radio, String color) {
        super(radio, color);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double calcularArea() {
        return 2 * Math.PI * super.getRadio() * this.altura + 2.0 * super.calcularArea();
    }

    public double calcularVolumen() {
        return super.calcularArea() * this.altura;
    }

    public String toString() {
        return "Cilindro es subclase de " + super.toString() + ", altura='" + this.altura + '\'' + '}';
    }


}
