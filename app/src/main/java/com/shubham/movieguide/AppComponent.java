package com.shubham.movieguide;

import com.shubham.movieguide.details.DetailsComponent;
import com.shubham.movieguide.details.DetailsModule;
import com.shubham.movieguide.favorites.FavoritesModule;
import com.shubham.movieguide.listing.ListingComponent;
import com.shubham.movieguide.listing.ListingModule;
import com.shubham.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
