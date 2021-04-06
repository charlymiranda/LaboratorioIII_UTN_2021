package com.miranda.ejercicio3;


import com.miranda.ejercicio1.Circulo;

public class TestEjercicio3 {
    public static void main(String[] args) {
        /*la clase Cuadrado es sub clase de Rectangulo*/
        Cuadrado cuadradito = new Cuadrado("Azul", 5);
        System.out.println(cuadradito);
        /*aca utilizo el metodo perimetro, que es Rectangulo*/
        System.out.println(cuadradito.perimetro());

        /*La clase Rectangulo es Subclase de la clase abstracta figura*/
        Rectangulo rectangulito = new Rectangulo("Verde", 4, 8);
        System.out.println(rectangulito);
        System.out.println(rectangulito.perimetro());

        /*Utilizo la clase circulo del ejercicio 1*/
        Circulo circulito = new Circulo(5, "Rojo");
        System.out.println(circulito);
    }
}
