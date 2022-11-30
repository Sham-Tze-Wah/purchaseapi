package com.cinematicketsys.purchaseapi.dao;

import com.cinematicketsys.purchaseapi.common.Genre;
import com.cinematicketsys.purchaseapi.common.MovieStatus;
import com.cinematicketsys.purchaseapi.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Repository("mysql")
public class MovieAccessDataService implements MovieDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MovieAccessDataService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertMovie(UUID id, Movie movie) {
        return 0;
    }

    @Override
    public List<Movie> selectAllMovie() {
        final String sql = "SELECT movieId, movieTitle, releaseDate, description, genre, movieStatus, venueId FROM Movie ";
        List<Movie> query = jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("movieId"));
            String title = resultSet.getString("movieTitle");

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = resultSet.getString("releaseDate");

            Genre genre = Genre.valueOf(resultSet.getString("genreId"));
            MovieStatus movieStatus = MovieStatus.valueOf(resultSet.getString("movieStatus"));

            Date releaseDate = null;
            if(!date.isEmpty()){
                try {
                    releaseDate = formatter.parse(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            return new Movie(id, title, releaseDate, genre, movieStatus);

        });

        //return Arrays.asList(new User(UUID.randomUUID(), "FROM POSTGRES DB", "shamtzewah@gmail.com"));

        return query;
    }

    @Override
    public Optional<Movie> selectMovieById(UUID id) {
        final String sql = "SELECT movieId, movieTitle, releaseDate, description, genre, movieStatus, venueId FROM Movie WHERE id = ?";
        Movie movie = jdbcTemplate.queryForObject(sql,
                new RowMapper<Movie>(){
                    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
                        UUID movieId = UUID.fromString(rs.getString("movieId"));
                        String title = rs.getString("name");

                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String date = rs.getString("releaseDate");

                        Genre genre = Genre.valueOf(rs.getString("genre"));
                        MovieStatus movieStatus = MovieStatus.valueOf(rs.getString("movieStatus"));

                        Date releaseDate = null;
                        if(!date.isEmpty()){
                            try {
                                releaseDate = formatter.parse(date);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }

                        return new Movie(movieId, title, releaseDate, genre, movieStatus);
                    }
                }, id);
            return Optional.ofNullable(movie);
    }

    @Override
    public int deleteMovieById(UUID id) {
        return 0;
    }

    @Override
    public int updateMovieById(UUID id) {
        return 0;
    }
}
