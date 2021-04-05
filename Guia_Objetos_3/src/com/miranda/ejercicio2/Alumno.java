package com.miranda.ejercicio2;

public class Alumno extends Persona{
    private int añoIngreso;
    private double cuota;
    private String carrera;

    public Alumno(){

    }

    public Alumno(int añoIngreso, double cuota, String carrera) {
        this.añoIngreso = añoIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public Alumno(String dni, String nombre, String apellido, String email, String direccion, int añoIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.añoIngreso = añoIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "añoIngreso=" + añoIngreso +
                ", cuota=" + cuota +
                ", carrera='" + carrera + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
