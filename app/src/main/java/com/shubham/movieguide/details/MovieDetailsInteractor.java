package com.shubham.movieguide.details;


import com.shubham.movieguide.Review;
import com.shubham.movieguide.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
