package com.miranda.test;

import com.miranda.clases.Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        /*problema 2*/
        Empleado emple = new Empleado("Carlos", "Gutierrez", "23456345", 25000);

        Empleado emple2 = new Empleado("Ana", "Sanchez", "34234123", 27500);

        String Carlos = emple.toString();
        System.out.println("Carlos = " + Carlos);

        String ana = emple2.toString();
        System.out.println("ana = " + ana);
        emple.aumentarSalario(15);

        System.out.println(emple.getSalario());
        System.out.println(emple.calcularSalarioAnual());
    }
}
