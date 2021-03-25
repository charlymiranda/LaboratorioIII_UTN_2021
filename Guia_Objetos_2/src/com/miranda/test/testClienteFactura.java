package com.miranda.test;

import com.miranda.clases.Cliente;
import com.miranda.clases.Factura;
import com.miranda.clases.ItemVenta;

public class testClienteFactura {
    public static void main(String[] args) {
        Cliente cacho = new Cliente("Cacho", "cacho@mail.com", 0);
        //Cliente pablo = new Cliente("Pablo", "pablo@mail.com", 15);
        //Cliente nico = new Cliente("Nicolas", "nico@mail.com", 15);

        /* ITEMS FOR SALE*/
        ItemVenta rice = new ItemVenta("Rice", "arroz largo fino", 45);
        ItemVenta coca = new ItemVenta("CocaCola", "soda", 120);
        ItemVenta fernet = new ItemVenta("fetnet", "Con cocacola", 450);
        ItemVenta stellaArtois = new ItemVenta("Stella Artois", "Beer", 150);

        ItemVenta[] items = new ItemVenta[4];
        items[0]= rice;
        items[1] = coca;
        items[2] = fernet;
        items[3] = stellaArtois;

        Factura fCacho = new Factura(cacho, items);

        System.out.println(fCacho.toString());

    }
}
