package com.miranda.clases;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String phone;
    private String direction;

    /*peliculas alquiladas por cliente*/
    private List<Movie> movieList = new ArrayList<>();



    public Client() {
    }

    public Client(String name, String phone, String direction) {
        this.name = name;
        this.phone = phone;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(Movie movie) {
        this.movieList.add(movie);
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
