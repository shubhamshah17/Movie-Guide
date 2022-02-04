package com.shubham.movieguide.favorites;


import com.shubham.movieguide.Movie;

import java.util.List;

public interface FavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
