package com.shubham.movieguide.details;

import com.shubham.movieguide.Review;
import com.shubham.movieguide.ReviewsWrapper;
import com.shubham.movieguide.Video;
import com.shubham.movieguide.VideoWrapper;
import com.shubham.movieguide.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
