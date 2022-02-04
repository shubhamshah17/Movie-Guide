package com.shubham.movieguide.listing;


import com.shubham.movieguide.Movie;

import java.util.List;

import io.reactivex.Observable;

public interface MoviesListingInteractor {
    boolean isPaginationSupported();

    Observable<List<Movie>> fetchMovies(int page);

    Observable<List<Movie>> searchMovie(String searchQuery);
}
