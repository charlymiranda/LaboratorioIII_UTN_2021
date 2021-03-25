package com.miranda.clases;


import java.util.Arrays;

public class Book{
    private String title;
    private double price;
    private int stock;
    private Author author;
    private Author[] authors;

    public Book() {
    }

    public Book(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public Book(String title, double price, int stock, Author autor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public Book(String title, double price, int stock, Author[] authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public void increaseBooks(int increase) {
        this.stock = this.stock + increase;
    }

    public String printMessage(Author author) {
        String message = "El libro " + this.title + " de " + author.getName() + ". Se vende a " + this.price + " pesos";
        return message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                '}';
    }

    public String toStringAuthors() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                //", author=" + author +
                ",\n authors=" + Arrays.toString(authors) +
                '}';
    }
}
