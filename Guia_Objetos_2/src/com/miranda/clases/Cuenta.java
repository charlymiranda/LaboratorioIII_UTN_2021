package com.miranda.clases;

import java.util.UUID;

public class Cuenta {

    private UUID id;
    private double balance;
    private ClienteCuenta client;
    private  static final int MAX_OPERATIONS = 10;
    private int operationsCounter=0;
    public String[] record = new String[10];

    public Cuenta(){

    }

    public Cuenta(double balance, ClienteCuenta client){
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    public void extract(double extracting){
        int i;
        if(this.balance<extracting){
            System.out.println("insufficient amount");
        }else{
            this.balance -= extracting;
            i=movementRecord();
            this.record[i] = "El " + client.getNombre() + ", retiro " + extracting;
            System.out.println(record[i]);
        }
    }

    public void extractRegister(){


    }

    public void deposit(double depositing){
        this.balance += depositing;
    }

    public int movementRecord(){
        return  this.operationsCounter++;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteCuenta getClient() {
        return client;
    }

    public void setClient(ClienteCuenta client) {
        this.client = client;
    }

    public static int getMaxOperations() {
        return MAX_OPERATIONS;
    }

    public int getOperationsCounter() {
        return operationsCounter;
    }

    public void setOperationsCounter(int operationsCounter) {
        this.operationsCounter = operationsCounter;
    }

    public String[] getRecord() {
        return record;
    }

    public void setRecord(String[] record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", balance=" + balance +
                ", client=" + client +
                ", operationsCounter=" + operationsCounter +
                '}';
    }
}
