package com.miranda.clases;

import java.time.LocalDate;

public class Movies {
    public static final Movie spiderMan = new Movie("SpiderMan HomeComing", LocalDate.of(2013, 04, 12), Genre.ADVENTURE,Qualification.PG ,"90","EEUU","Movie about Spider-man", 10);
    public static final Movie ironMan = new Movie("Iron Man", LocalDate.of(2008, 04, 12), Genre.ACTION,Qualification.PG ,"90","EEUU","Movie about Tonu Stark", 10);
    public static final Movie capitanAmerica = new Movie("Capitan America", LocalDate.of(2010, 04, 12), Genre.ADVENTURE,Qualification.PG ,"90","EEUU","Movie about Steve Rogers", 10);
    public static final Movie  thor = new Movie("SpiderMan HomeComing", LocalDate.of(2013, 04, 12), Genre.ADVENTURE,Qualification.PG ,"90","EEUU","Movie about Spider-man", 10);

    public Movies(){

    }
}
