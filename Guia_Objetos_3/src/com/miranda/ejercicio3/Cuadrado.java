package com.miranda.ejercicio3;


public class Cuadrado extends Rectangulo {

    public Cuadrado() {
        super(1.0, 1.0);
    }

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    public String toString() {
        return "Cuadrado{base=" + this.ancho + ", altura=" + this.alto + ", color='" + super.getColor() + '\'' + '}';
    }

}
