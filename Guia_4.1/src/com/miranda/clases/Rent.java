package com.miranda.clases;

import java.time.LocalDate;

public class Rent {

    private Movie movie;
    private Client client;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    public Rent() {
    }

    public Rent(Movie movie, Client client, LocalDate rentalDate, LocalDate returnDate) {
        this.movie = movie;
        this.client = client;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
