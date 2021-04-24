package com.miranda;


import com.miranda.clases.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Creamos clase de peliculas para que el main este mass limpio*/

        Client daiana = new Client("Daiana Catalano", "15577669", "dolores 961");
        Client carlos = new Client("Carlos Miranda", "15577669", "dolores 961");
        Client vero = new Client("Vero Catalano", "15577669", "dolores 961");
        Client eze = new Client("Rage", "15577669", "dolores 961");

        Rent rent1 = new Rent(Movies.capitanAmerica, daiana, LocalDate.now(), LocalDate.now());
        daiana.setMovieList(Movies.capitanAmerica);
        Rent rent2 = new Rent(Movies.capitanAmerica, carlos, LocalDate.now(), LocalDate.of(2021, 04, 26));
        carlos.setMovieList(Movies.capitanAmerica);
        Rent rent3 = new Rent(Movies.capitanAmerica, vero, LocalDate.now(), LocalDate.of(2021, 04, 26));
        Rent rent4 = new Rent(Movies.spiderMan, eze, LocalDate.now(), LocalDate.of(2021, 04, 28));
        Rent rent5 = new Rent(Movies.spiderMan, carlos, LocalDate.now(), LocalDate.of(2021, 04, 28));
        carlos.setMovieList(Movies.spiderMan);
        Rent rent6 = new Rent(Movies.spiderMan, vero, LocalDate.now(), LocalDate.of(2021, 04, 28));
        Rent rent7 = new Rent(Movies.ironMan, eze, LocalDate.now(), LocalDate.of(2021, 04, 29));
        List<Rent> rentList = new ArrayList<>();
        rentList.add(rent1);
        rentList.add(rent2);
        rentList.add(rent3);
        rentList.add(rent4);
        rentList.add(rent5);
        rentList.add(rent6);
        rentList.add(rent7);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(Movies.capitanAmerica);
        movieList.add(Movies.ironMan);
        movieList.add(Movies.spiderMan);
        movieList.add(Movies.thor);

        List<Client> clientList = new ArrayList<>();
        clientList.add(daiana);
        clientList.add(eze);
        clientList.add(carlos);
        clientList.add(vero);

        VideoStore videoStore = new VideoStore(movieList, clientList, rentList);

        videoStore.showRentals();
        videoStore.todaysReturns();
        videoStore.moviesForClient("Carlos Miranda");


    }
}
