package com.cinematicketsys.purchaseapi.dao;

import com.cinematicketsys.purchaseapi.model.Movie;
import com.cinematicketsys.purchaseapi.model.Ticket;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MovieDao {
    int insertMovie(UUID id, Movie movie);

    default int insertMovie(Movie movie){
        UUID id = UUID.randomUUID();
        return insertMovie(id, movie);
    }

    List<Movie> selectAllMovie();

    Optional<Movie> selectMovieById(UUID id);

    int deleteMovieById(UUID id);

    int updateMovieById(UUID id);
}

