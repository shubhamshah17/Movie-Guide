package com.shubham.movieguide;

import java.util.List;
import com.squareup.moshi.Json;

public class VideoWrapper {

    @Json(name = "results")
    private List<Video> videos;

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
