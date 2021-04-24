package com.miranda.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Movie> movieList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();
    private List<Rent> rentList = new ArrayList<>();

    public VideoStore(){

    }

    public VideoStore(List<Movie> movieList, List<Client> clientList, List<Rent> rentList) {
        this.movieList = movieList;
        this.clientList = clientList;
        this.rentList = rentList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Rent> getRentList() {
        return rentList;
    }

    public void setRentList(List<Rent> rentList) {
        this.rentList = rentList;
    }

    public void showRentals(){
        System.out.println("rented movies: ");
        int i=0;
        for(Rent rent: rentList){
            System.out.println("Rental number " + i + ": " + rent.getMovie());
            i++;
        }
    }

    public void todaysReturns(){
        for(Rent rent: rentList){
            if(rent.getReturnDate().equals(LocalDate.now())){
                System.out.println("today's returns " + rent.getMovie());
            }
        }
    }

    public void moviesForClient(String name){
        for(Client client: clientList){
            if(client.getName().equals(name))
            System.out.println("\n Movies rents by " + name +  client.getMovieList());
        }
    }



}
