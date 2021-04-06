package com.miranda.ejercicio3;

public abstract class Figura {
    private String color;

    public Figura(){

    }

    public Figura(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
