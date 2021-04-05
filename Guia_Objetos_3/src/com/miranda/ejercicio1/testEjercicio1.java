package com.miranda.ejercicio1;

public class testEjercicio1 {
    public static void main(String[] args) {


        Cilindro cilindro = new Cilindro();
        System.out.println(cilindro.toString());
        System.out.println("El area del cilindro es: " + cilindro.calcularArea());
        System.out.println("El volumen del cilindro esL " + cilindro.calcularVolumen());

        Cilindro cilindro2 = new Cilindro(5.0,  10.0);
        cilindro2.setColor("Azul");
        System.out.println(cilindro2.toString());

        System.out.println("El area del cilindro es: " + cilindro2.calcularArea());
        System.out.println("El volumen del cilindro es: " + cilindro2.calcularVolumen());


    }
}
