package com.shubham.movieguide.details;


import dagger.Subcomponent;

@com.shubham.movieguide.details.DetailsScope
@Subcomponent(modules = {com.shubham.movieguide.details.DetailsModule.class})
public interface DetailsComponent {
    void inject(MovieDetailsFragment target);
}
