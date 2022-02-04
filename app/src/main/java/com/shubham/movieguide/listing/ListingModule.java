package com.shubham.movieguide.listing;

import com.shubham.movieguide.favorites.FavoritesInteractor;
import com.shubham.movieguide.listing.sorting.SortingOptionStore;
import com.shubham.movieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
