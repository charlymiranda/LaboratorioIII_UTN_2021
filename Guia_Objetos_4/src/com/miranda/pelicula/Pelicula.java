package com.miranda.pelicula;

import java.time.LocalDate;

public class Pelicula {
    private int duracion;
    private int stock;
    private String clasificacion;
    private String titulo;
    private LocalDate lanzamiento;
    private String genero;

    public Pelicula() {
    }

    public Pelicula(int duracion, int stock, String clasificacion, String titulo, LocalDate lanzamiento, String genero) {
        this.duracion = duracion;
        this.stock = stock;
        this.clasificacion = clasificacion;
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "duracion=" + duracion +
                ", stock=" + stock +
                ", clasificacion='" + clasificacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", lanzamiento=" + lanzamiento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
