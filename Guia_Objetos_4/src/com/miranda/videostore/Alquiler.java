package com.miranda.videostore;

import com.miranda.cliente.Cliente;
import com.miranda.pelicula.Pelicula;

import java.time.LocalDate;

public class Alquiler {
    private static int i = 1;

    private int id;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate prestamo;
    private LocalDate devolucion;

    public Alquiler(Pelicula film, Cliente cliente, LocalDate prestamo) {
        this.id = i++;
        this.pelicula = film;
        this.cliente = cliente;
        this.prestamo = prestamo;
        this.devolucion = prestamo.plusDays(2);
    }

    public int getId() {
        return id;
    }

    public Pelicula getFilm() {
        return pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getPrestamo() {
        return prestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", film=" + pelicula +
                ", cliente=" + cliente +
                ", prestamo=" + prestamo +
                ", devolucion=" + devolucion +
                '}';
    }
}
