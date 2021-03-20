package com.miranda.test;

import com.miranda.clases.Cuenta;

public class testCuenta {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1, "cuanta de charly", 15000.00);
        double cred = cuenta.credito(2500);
        System.out.println("Balance de la cuenta: " + cuenta.getBalance());
        System.out.println("Balance de la cuenta: " + cred);
        double compra1 = cuenta.debito(1500);
        System.out.println("compra1 = " + compra1);
        double compra2 = cuenta.debito(30000);
        System.out.println("compra2 = " + compra2);


    }
}
