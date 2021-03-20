package com.miranda.test;

import com.miranda.clases.Hora;

public class testHora {
    public static void main(String[] args) {
        System.out.println("\n==== Ejercicio 5 ==== \n");
        Hora hora = new Hora(23, 59, 59);
        System.out.println(hora);

        hora.sumarSeg();
        System.out.println(hora);

        hora.retrocederSeg();
        System.out.println(hora);
    }
}
