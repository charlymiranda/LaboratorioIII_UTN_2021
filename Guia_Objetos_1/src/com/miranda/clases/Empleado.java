package com.miranda.clases;

public class Empleado {
    private String name;
    private String lastName;
    private String dni;
    private double salario;

    public Empleado() {

    }

    public Empleado(String name, String lastName, String dni, double salario) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {

        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario = this.salario + (this.salario * (porcentaje / 100));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }
}
