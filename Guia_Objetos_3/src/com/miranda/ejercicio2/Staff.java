package com.miranda.ejercicio2;

public class Staff extends Persona{
    private double salario;
    private String turno;// manana o noche

    public Staff() {
    }

    public Staff(double salario, String turno) {
        this.salario = salario;
        this.turno = turno;
    }

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual(){
        return this.salario* 12;
    }

    public String toString() {
        return "Staff{salario=" + this.salario + ", turno=" + this.turno
                + ", dni=" + this.dni + ", nombre='" + this.nombre + '\'' + ", " +
                "apellido='" + this.apellido + '\'' + ", email='" + this.email + '\'' + ", direccion='"
                + this.direccion + '\'' + '}';
    }
}
