package com.cinematicketsys.purchaseapi.model;

import com.cinematicketsys.purchaseapi.common.Genre;
import com.cinematicketsys.purchaseapi.common.MovieStatus;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class Movie {
    @Id
    final UUID id;

    @Column(name="title")
    String title;

    @Column(name="releaseDate")
    Date releaseDate;

    @Column(name="description")
    String description;

    @Column(name="genre")
    final Genre genre;

    @Column(name="movieStatus")
    MovieStatus movieStatus;

    @Column(name="venue")
    Venue venue;

    //soon the movie will be released
    public Movie(UUID id, String title, Date releaseDate, Genre genre, MovieStatus movieStatus) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.movieStatus = movieStatus;
    }

    public Movie(UUID id, String title, Date releaseDate, Genre genre, Venue venue) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.venue = venue;
    }

    public UUID getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
