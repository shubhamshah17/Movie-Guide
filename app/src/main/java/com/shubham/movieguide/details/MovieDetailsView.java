package com.shubham.movieguide.details;

import com.shubham.movieguide.Movie;
import com.shubham.movieguide.Review;
import com.shubham.movieguide.Video;

import java.util.List;

interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
