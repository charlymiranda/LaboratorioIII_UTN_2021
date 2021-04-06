package com.miranda.ejercicio3;

public class Rectangulo extends Figura{
    protected double alto;
    protected double ancho;

    public Rectangulo(){

    }

    public Rectangulo(double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;

    }

    public Rectangulo(String color, double ancho, double alto){
        super(color);
        this.alto=alto;
        this.ancho=ancho;
    }

    public double perimetro(){
        return 2 * (this.ancho + this.alto);
    }

    public double getAlto(){
        return alto;
    }
    public void setAlto(double alto){
        this.alto=alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
