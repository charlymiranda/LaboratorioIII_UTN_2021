package com.miranda.test;

import com.miranda.clases.ClienteCuenta;
import com.miranda.clases.Cuenta;

public class testCuentaBanco {
    public static void main(String[] args) {

        ClienteCuenta pepe = new ClienteCuenta("Pepe", 'm');
        System.out.println("pepe = " + pepe);
        Cuenta cPepe = new Cuenta(2500, pepe);
        System.out.println("cPepe = " + cPepe);

        System.out.println(cPepe.getBalance());
        cPepe.deposit(520);
        System.out.println("cPepe.getBalance() = " + cPepe.getBalance());

        cPepe.extract(1000);
        System.out.println("cPepe.getBalance() = " + cPepe.getBalance());
        System.out.println(cPepe.record[0]);


    }
}
