package com.miranda.videostore;

import com.miranda.cliente.Cliente;
import com.miranda.pelicula.Pelicula;

import java.util.Arrays;

public class VideoStore {

    private Pelicula peliculas[];
    private Cliente clientes[];
    private Alquiler alquileres[];

    public VideoStore(Pelicula[] peliculas, Cliente[] clientes, Alquiler[] alquileres) {
        this.peliculas = peliculas;
        this.clientes = clientes;
        this.alquileres = alquileres;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler[] alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "peliculas=" + Arrays.toString(peliculas) +
                ", clientes=" + Arrays.toString(clientes) +
                ", alquileres=" + Arrays.toString(alquileres) +
                '}';
    }
}
