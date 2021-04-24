package com.miranda.clases;
import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate releaseDate;
    private String genre;
    private String duration;
    private String qualification;
    private String country;
    private String description;
    private int stock;

    public Movie() {
    }

    public Movie(String title, LocalDate releaseDate, String genre, String duration, String qualification,
                 String country, String description, int stock) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.qualification = qualification;
        this.country = country;
        this.description = description;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                ", qualification='" + qualification + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                '}';
    }
}
