package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Movie;
import com.arshad.BookMyShow.Repository.MovieRepository;
import com.arshad.BookMyShow.Service.Interface.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie saveMovie(Movie movie){
       return movieRepository.save(movie);
    }
    public Movie findMovieByName(String name){
        return movieRepository.findMovieByName(name);
    }
}
