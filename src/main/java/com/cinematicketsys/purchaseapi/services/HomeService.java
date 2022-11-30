package com.cinematicketsys.purchaseapi.services;

import com.cinematicketsys.purchaseapi.dao.MovieDao;
import com.cinematicketsys.purchaseapi.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    private final MovieDao movieDao;

    @Autowired
    public HomeService(@Qualifier("mysql") MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> displayAllMovieDetails(){
        return movieDao.selectAllMovie();
    }
}
