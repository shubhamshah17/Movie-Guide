# MovieGuide
Movie Guide is an open source Android application for [TMDb](https://www.themoviedb.org). It showcases detailed information about movies, tv shows and actors from TMDb.

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![License](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](https://github.com/AshishKayastha/Movie-Guide#license)
[![API](https://img.shields.io/badge/API-21%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![PRs Welcome](https://img.shields.io/badge/prs-welcome-brightgreen.svg)](http://makeapullrequest.com)

## Features
* Material design with delightful animations.
* Minimal and simple user interface, which user can get easily acquainted with.
* View movies, tv shows and actors information from TMDb.
* Search and filter your favorite movies, tv shows and people.
* View movie and tv show ratings from OMDb.

## Movie Guide Implementations
* Min SDK 21 with material design and animations
* Follows MVP pattern for separation of concerns
* [Retrofit 2](http://square.github.io/retrofit/) for performing network requests
* [RxJava 2](https://github.com/ReactiveX/RxJava) and [RxAndroid 2](https://github.com/ReactiveX/RxAndroid) for asynchronous functionality
* [Dagger 2](http://google.github.io/dagger/) for dependency injection with subcomponent multibindings
* [KotterKnife](https://github.com/JakeWharton/kotterknife) for view bindings.
* [Timber](https://github.com/JakeWharton/timber) for logging
* [Glide](https://github.com/bumptech/glide/) for image loading
* Custom Tabs support library for TMDb login functionality 
* Palette support library for extracting colors from image
* Other support libraries - AppCompat, RecyclerView, CardView, Design

Android app that lists popular/highest-rated movies, shows trailers and reviews.

This app showcases the MVP pattern, RxJava, Dagger 2 and Uncle Bob Martin's Clean Architecture approach.
Optimized for tablets.

### Building the app
1. Open `local.properties` in the root directory.
2. Add your [TMDB](https://themoviedb.org) API key as follows
```
tmdb_api_key=ADD_YOUR_API_KEY_HERE
```
3. Run the app.

## Contributing
You can contribute to the project by either finding out bugs or by requesting new features. Besides that, if you are a developer then you can contribute by submitting pull requests. There is TODO list to get you started with.

Any feedback or contributions are welcome!

### Screenshots
![Screenshot](http://i.imgur.com/72PypXCm.png) 
![screenshot2](http://imgur.com/I96Eka6m.png)
![screenshot3](http://imgur.com/4qHZcejm.png)
![screenshot4](http://imgur.com/m7J8HzUm.png)
![screenshot5](http://imgur.com/PwtjZHKm.png)
![screenshot6](http://imgur.com/kNHjCXSm.png)
