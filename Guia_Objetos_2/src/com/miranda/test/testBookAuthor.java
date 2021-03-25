package com.miranda.test;

import com.miranda.clases.Author;
import com.miranda.clases.Book;

public class testBookAuthor {
    public static void main(String[] args) {
        /*EJERCICIO 1*/
        // PUNTO A
        Author joshua = new Author("Joshua", "Bloch", "joshua@email.com", 'm');
        // PUNTO B
        System.out.println("author= " + joshua.toString());
        // PUNTO C
        Book EffectiveJava = new Book("Effective Java", 500, 50, joshua);
        // PUNTO D
        System.out.println(EffectiveJava.toString());
        // PUNTO E
        EffectiveJava.setPrice(500);
        System.out.println("The price of the book was changed. The new price is " + EffectiveJava.getPrice());
        EffectiveJava.increaseBooks(50);
        System.out.println("the Stock was increased by 50. Total books " + EffectiveJava.getStock());
        //System.out.println(EffectiveJava.getStock());
        // PUNTO F
        System.out.println(EffectiveJava.printMessage(joshua));

        // PUNTO H
        Author newAuthor = new Author("Carlos", "Miranda", "miranda@email.com", 'M');
        Author[] listAuthors = new Author[2];
        listAuthors[0] = joshua;
        listAuthors[1] = newAuthor;
        EffectiveJava.setAuthors(listAuthors);
        System.out.println(EffectiveJava.toStringAuthors());


    }
}
