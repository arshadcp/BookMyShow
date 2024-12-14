package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Movie;

public interface MovieService {
    Movie saveMovie(Movie movie);
    Movie findMovieByName(String name);
}
